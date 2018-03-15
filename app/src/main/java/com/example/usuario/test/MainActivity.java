package com.example.usuario.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nombre;
    private Button button;
    public static final String nombre_INTENT = "nombre";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(EditText) findViewById(R.id.nombreEditText);
        button=(Button) findViewById(R.id.OKbutton);
        button.setOnClickListener(this);




    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.OKbutton:
                Intent intentEnviar = new Intent(MainActivity.this, SecondActivity.class);
                intentEnviar.putExtra(MainActivity.nombre_INTENT,nombre.getText().toString());
                startActivity(intentEnviar);

                return;
        }
    }
}


