package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {


    EditText mTextCorreo;
    EditText mTextContrasenia;
    Button mButtonIngresar;
    TextView mTextViewRegistrate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mTextCorreo = (EditText) findViewById(R.id.edittext_correo);
        mTextContrasenia = (EditText) findViewById(R.id.edittext_contrasenia);
        mButtonIngresar = (Button) findViewById(R.id.button_ingresar);
        mTextViewRegistrate = (TextView) findViewById(R.id.textview_registrate);

        mTextViewRegistrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent (v.getContext(),RegistrateActivity.class);
                startActivity(registerIntent);
            }
        });

    }
}
