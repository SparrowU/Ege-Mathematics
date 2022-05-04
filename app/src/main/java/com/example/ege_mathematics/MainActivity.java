package com.example.ege_mathematics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button base, prof, theory;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        base = findViewById(R.id.base);
        prof = findViewById(R.id.prof);
        theory = findViewById(R.id.theory);
    }
    public void base(View view){
        switch (view.getId()) {
            case R.id.base:
                Intent intent = new Intent(this, BaseMath.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void prof(View view) {
        switch (view.getId()) {
            case R.id.prof:
                Intent intent = new Intent(this, ProfileMath.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }


    public void theory(View view){

        switch (view.getId()) {
            case R.id.theory:
                Intent intent = new Intent(this, theoretitics.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void to_exercizes(View view){
        switch (view.getId()) {
            case R.id.to_exercizes:
                Intent intent = new Intent(this, exercizes.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }



}