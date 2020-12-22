package com.example.quizapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.FileUtils;
import android.view.View;
import android.widget.Toast;

import com.example.quizapp.databinding.ActivitySigninBinding;
import com.example.quizapp.databinding.ActivitySignupBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Signin extends AppCompatActivity {
ActivitySigninBinding binding;
FirebaseAuth auth;
ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySigninBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        auth=FirebaseAuth.getInstance();

        dialog = new ProgressDialog(this);
        dialog.setMessage("Gear up your brain...");

        if(auth.getCurrentUser() != null) {
            startActivity(new Intent(Signin.this, MainActivity.class));
            finish();
        }

        binding.signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email,password;
                email=binding.email.getText().toString();
                password=binding.password.getText().toString();

                dialog.show();
                auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            dialog.dismiss();
                            startActivity(new Intent(Signin.this,MainActivity.class));
                            finish();
                       }
                        else
                        {
                            dialog.dismiss();
                            Toast.makeText(Signin.this, task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                binding.signUp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Signin.this,Signup.class));
                    }
                });
            }
        });

    }
}