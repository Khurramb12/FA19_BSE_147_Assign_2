package com.example.fa19_bse_147_assign_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button on, tw, th, fo, fi, si, sev, egt, ni,Back,Enter, ze;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        on =findViewById(R.id.one);
        tw =findViewById(R.id.two);
        th =findViewById(R.id.three);

        fo =findViewById(R.id.four);
        fi =findViewById(R.id.five);
        si =findViewById(R.id.six);
        sev =findViewById(R.id.seven);
        egt =findViewById(R.id.eight);
        ni =findViewById(R.id.nine);
        ze =findViewById(R.id.zero);
        editText =findViewById(R.id.editt);
        Enter=findViewById(R.id.Enter);
        Back=findViewById(R.id.back);

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"1");
            }
        });


        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"2");
            }
        });

        th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"3");
            }
        });

        fo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"4");
            }
        });

        fi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"5");
            }
        });

        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"6");
            }
        });

        sev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"7");
            }
        });


        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });

        egt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"8");
            }
        });

        ni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"9");
            }
        });

        ze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"0");
            }
        });


        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ps ="0000";
                if(editText.getText().toString().equals(ps)){
                    Intent intent = new Intent(MainActivity.this,Home.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Entered Password is incorrect ", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}






