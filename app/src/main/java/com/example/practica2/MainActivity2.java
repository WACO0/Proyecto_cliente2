package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;


public class MainActivity2 extends AppCompatActivity {

    CheckBox c1,c2,c3,c4,c5,c6,c7,c8;
    private EditText c11;
    private EditText c12;
    private EditText c13;
    private EditText c14;
    private EditText c15;
    private EditText c16;
    private EditText c17;
    private EditText c18;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        c1= (CheckBox) findViewById(R.id.checkBox1);
        c2= (CheckBox) findViewById(R.id.checkBox2);
        c3= (CheckBox) findViewById(R.id.checkBox3);
        c4= (CheckBox) findViewById(R.id.checkBox4);
        c5= (CheckBox) findViewById(R.id.checkBox5);
        c6= (CheckBox) findViewById(R.id.checkBox6);
        c7= (CheckBox) findViewById(R.id.checkBox7);
        c8= (CheckBox) findViewById(R.id.checkBox8);

        c11 = (EditText) findViewById(R.id.textView1);
        c12 = (EditText) findViewById(R.id.textView2);
        c13 = (EditText) findViewById(R.id.textView3);
        c14 = (EditText) findViewById(R.id.textView4);
        c15 = (EditText) findViewById(R.id.textView5);
        c16 = (EditText) findViewById(R.id.textView6);
        c17 = (EditText) findViewById(R.id.textView7);
        c18 = (EditText) findViewById(R.id.textView8);


        SharedPreferences pendiente1 = getSharedPreferences("dato1", Context.MODE_PRIVATE);
        c11.setText(pendiente1.getString("m1",""));
        SharedPreferences pendiente2 = getSharedPreferences("dato2", Context.MODE_PRIVATE);
        c12.setText(pendiente2.getString("m2",""));
        SharedPreferences pendiente3 = getSharedPreferences("dato3", Context.MODE_PRIVATE);
        c13.setText(pendiente3.getString("m3",""));
        SharedPreferences pendiente4 = getSharedPreferences("dato4", Context.MODE_PRIVATE);
        c14.setText(pendiente4.getString("m4",""));
        SharedPreferences pendiente5 = getSharedPreferences("dato5", Context.MODE_PRIVATE);
        c15.setText(pendiente5.getString("m5",""));
        SharedPreferences pendiente6 = getSharedPreferences("dato6", Context.MODE_PRIVATE);
        c16.setText(pendiente6.getString("m6",""));
        SharedPreferences pendiente7 = getSharedPreferences("dato7", Context.MODE_PRIVATE);
        c17.setText(pendiente7.getString("m7",""));
        SharedPreferences pendiente8 = getSharedPreferences("dato8", Context.MODE_PRIVATE);
        c18.setText(pendiente8.getString("m8",""));


    }

//metodo para volver a la activity principal
    public void Anterior (View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

    public void  Guardar (View view){
        SharedPreferences deber1 = getSharedPreferences("dato1", Context.MODE_PRIVATE);
        SharedPreferences deber2 = getSharedPreferences("dato2", Context.MODE_PRIVATE);
        SharedPreferences deber3 = getSharedPreferences("dato3", Context.MODE_PRIVATE);
        SharedPreferences deber4 = getSharedPreferences("dato4", Context.MODE_PRIVATE);
        SharedPreferences deber5 = getSharedPreferences("dato5", Context.MODE_PRIVATE);
        SharedPreferences deber6 = getSharedPreferences("dato6", Context.MODE_PRIVATE);
        SharedPreferences deber7 = getSharedPreferences("dato7", Context.MODE_PRIVATE);
        SharedPreferences deber8 = getSharedPreferences("dato8", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1 = deber1.edit();
        SharedPreferences.Editor editor2 = deber2.edit();
        SharedPreferences.Editor editor3 = deber3.edit();
        SharedPreferences.Editor editor4 = deber4.edit();
        SharedPreferences.Editor editor5 = deber5.edit();
        SharedPreferences.Editor editor6 = deber6.edit();
        SharedPreferences.Editor editor7 = deber7.edit();
        SharedPreferences.Editor editor8 = deber8.edit();

        editor1.putString("m1", c11.getText().toString());
        editor2.putString("m2", c12.getText().toString());
        editor3.putString("m3", c13.getText().toString());
        editor4.putString("m4", c14.getText().toString());
        editor5.putString("m5", c15.getText().toString());
        editor6.putString("m6", c16.getText().toString());
        editor7.putString("m7", c17.getText().toString());
        editor8.putString("m8", c18.getText().toString());
        editor1.commit();
        editor2.commit();
        editor3.commit();
        editor4.commit();
        editor5.commit();
        editor6.commit();
        editor7.commit();
        editor8.commit();
        finish();

    }

   public void Borrar(View view){
        if(view.getId()==R.id.button2){
            box();
        }
   }

    public void box (){
        if(c1.isChecked()){
            c11.setText("");
        }
        if(c2.isChecked()){
            c12.setText("");
        }
        if(c3.isChecked()){
            c13.setText("");
        }
        if(c4.isChecked()){
            c14.setText("");
        }
        if(c5.isChecked()){
            c15.setText("");
        }
        if(c6.isChecked()){
            c16.setText("");
        }
        if(c7.isChecked()){
            c17.setText("");
        }
        if(c8.isChecked()){
            c18.setText("");

        }

    }
}
