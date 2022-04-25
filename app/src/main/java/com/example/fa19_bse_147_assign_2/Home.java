package com.example.fa19_bse_147_assign_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysafe);
        Toast.makeText(this, "Entered Safe Successfull", Toast.LENGTH_SHORT).show();
    }
}