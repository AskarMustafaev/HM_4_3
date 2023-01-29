package com.example.HM_4_3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.HM_4_3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.HM_4_3.databinding.ActivityMainBinding
                binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentsFragment()).commit();
        }
    }
}