package com.example.guisela.practica3intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_msj;
    RadioButton rdb1;
    RadioButton rdb2;
    RadioButton rdb3;
    RadioButton rdb4;
    RadioButton rdb5;
    RadioButton rdb6;
    RadioButton rdb7;
    RadioButton rdb8;
    RadioButton rdb9;
    RadioButton rdb10;
    Button btnenviar;
    TextView seleccionado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_msj  = (EditText)findViewById(R.id.edt_msj);
        //seleccionado =(TextView) findViewById(R.id.edt_msj);
        rdb1 = (RadioButton) findViewById(R.id.radioButton);
        rdb2 = (RadioButton) findViewById(R.id.radioButton2);
        rdb3 = (RadioButton) findViewById(R.id.radioButton3);
        rdb4 = (RadioButton) findViewById(R.id.radioButton4);
        rdb5 = (RadioButton) findViewById(R.id.radioButton5);
        rdb6 = (RadioButton) findViewById(R.id.radioButton6);
        rdb7 = (RadioButton) findViewById(R.id.radioButton7);
        rdb8 = (RadioButton) findViewById(R.id.radioButton8);
        rdb9 = (RadioButton) findViewById(R.id.radioButton9);
        rdb10 = (RadioButton) findViewById(R.id.radioButton10);
        btnenviar = (Button) findViewById(R.id.btnenviar);

        btnenviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent sendIntent = new Intent();
                String nombre = edt_msj.getText().toString();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,edt_msj.getText().toString());
               // sendIntent.setType("text/plain");

                if (rdb1.isChecked()) {

                    sendIntent.putExtra(Intent.EXTRA_TEXT,rdb1.getText().toString());
                }
                else if (rdb2.isChecked())
                {
                    sendIntent.putExtra(Intent.EXTRA_TEXT,rdb2.getText().toString());
                }
                else if (rdb3.isChecked())
                {
                    sendIntent.putExtra(Intent.EXTRA_TEXT,rdb3.getText().toString());
                }
                else if (rdb4.isChecked())
                {
                    sendIntent.putExtra(Intent.EXTRA_TEXT,rdb4.getText().toString());
                }
                else if (rdb5.isChecked())
                {
                    sendIntent.putExtra(Intent.EXTRA_TEXT,rdb5.getText().toString());
                }
                else if (rdb6.isChecked())
                {
                    sendIntent.putExtra(Intent.EXTRA_TEXT,rdb6.getText().toString());
                }
                else if (rdb7.isChecked())
                {

                    sendIntent.putExtra(Intent.EXTRA_TEXT,rdb7.getText().toString());
                }
                else if (rdb8.isChecked())
                {
                    sendIntent.putExtra(Intent.EXTRA_TEXT,rdb8.getText().toString());
                }
                else if (rdb9.isChecked())
                {
                    sendIntent.putExtra(Intent.EXTRA_TEXT,rdb9.getText().toString());
                }
                else if (rdb10.isChecked())
                {
                    sendIntent.putExtra(Intent.EXTRA_TEXT,rdb10.getText().toString());
                }


                sendIntent.setType("text/plain");

                if(null != sendIntent.resolveActivity(getPackageManager()))
                {
                    startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send)));
                }

            }

        });
    }

}

