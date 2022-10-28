package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //metodo para pasar de una activity a otra
    public void Siguiente (View view){
        Intent siguiente = new Intent(this, MainActivity2.class);
        startActivity(siguiente);
    }
}