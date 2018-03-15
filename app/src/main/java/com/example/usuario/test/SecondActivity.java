package com.example.usuario.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.usuario.test.com.test.beans.PersonaDTO;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{


    private Button button;
    private EditText calle;
    private EditText cp;
    public static final String CALLE_EXTRA="calle";
    public static final String CP_EXTRA = "CP";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();


        Intent intent=getIntent();

        Toast x;
        if(intent!=null){
            String nombre=intent.getStringExtra(MainActivity.nombre_INTENT);

            x=Toast.makeText(SecondActivity.this,nombre,Toast.LENGTH_LONG);
        }else{
            x=Toast.makeText(SecondActivity.this,"No tengo datos",Toast.LENGTH_LONG);
        }
        x.show();
        button.setOnClickListener(this);
    }

    @SuppressLint("WrongViewCast")
    private void init() {

        button=(Button)findViewById(R.id.nextButton);
        calle=(EditText) findViewById(R.id.NameStreetEditText);
        cp=(EditText) findViewById(R.id.CPEditText);
    }

    @Override
    public void onClick(View view) {

        Intent previusIntent=getIntent();
        PersonaDTO nombre=null;
        if(previusIntent!=null){
            nombre= (PersonaDTO) previusIntent.getSerializableExtra(MainActivity.nombre_INTENT);

        }

        Intent intent=new Intent(this,TercerActivity.class);
        intent.putExtra(SecondActivity.CALLE_EXTRA,calle.getText().toString());
        intent.putExtra(SecondActivity.CP_EXTRA,cp.getText().toString());
        if(nombre!=null){
            intent.putExtra(MainActivity.nombre_INTENT,nombre);
        }
        startActivity(intent);


    }
}
