package com.example.usuario.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TercerActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button;
    private TextView[] text=new TextView[3];
    private int[] IDS={R.id.nombreTextView,R.id.calleTextView,R.id.CPTextView};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
        init();
        if(button!=null){
            button.setOnClickListener(this);
        }
        leerDatos();

    }

    private void leerDatos() {
        for (int i=0;i<text.length;i++){
            text[i]=findViewById(IDS[i]);
        }
        Intent intent=getIntent();
        if(intent!=null){
            String[]datos={intent.getStringExtra(MainActivity.nombre_INTENT),
            intent.getStringExtra(SecondActivity.CALLE_EXTRA),
            intent.getStringExtra(SecondActivity.CP_EXTRA)};

            for(int i=0; i<text.length;i++){
                text[i].setText(datos[i]);
            }

        }

    }

    private void init() {

    button=(Button)findViewById(R.id.buttonFinish);



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"finito Jefe",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
