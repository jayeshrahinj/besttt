package com.example.bestbuyy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.bestbuyy.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
BottomNavigationView bottomNavigationView;
FirebaseAuth firebaseAuth;
ProgressDialog progressDialog;
FirebaseFirestore firebaseFirestore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
  bottomNavigationView= findViewById(R.id.bview);
        setContentView(binding.getRoot());
        firebaseAuth = FirebaseAuth.getInstance();
        binding.signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = binding.fullName.getText().toString();
                String number = binding.phoneNumber.getText().toString();
                String email = binding.email.getText().toString().trim();
                String password = binding.password.getText().toString();
                firebaseAuth.createUserWithEmailAndPassword(email, password)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                                progressDialog.cancel();
                                firebaseFirestore.collection("user")
                                        .document(FirebaseAuth.getInstance().getUid())
                                        .set( new UserModel(name,number,email));

                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                                progressDialog.cancel();

                            }
                        });


            }
        });
        binding.gotologinActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
            }
        });
        bottomNavigationView.setBackground(null);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId())
            {
                case R.id.homefrag:
                    replaceFragment(new profileFragment());
                    break;
                case R.id.settingfrag:
                    replaceFragment(new profileFragment());
                    break;
                case R.id.addfrag:
                    replaceFragment(new profileFragment());
                    break;
                case R.id.personfrag:
                    replaceFragment(new profileFragment());
                    break;
                case R.id.Searchfrag:
                    replaceFragment(new profileFragment());
                    break;

            }
            return true;
        });

//
//  private void replaceFragment(Fragment fragment) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frameLayout,fragment);
//        fragmentTransaction.commit();
  }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
       FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
       fragmentTransaction.commit();
    }
}
