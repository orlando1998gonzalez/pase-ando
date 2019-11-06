package com.example.loginapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.example.loginapplication.ui.SolicitudRegistro;

import org.json.JSONException;
import org.json.JSONObject;

public class RegistrateActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mTextNombreApellido;
    EditText mTextCorreo;
    EditText mTextContrasenia;
    EditText mTextConfirmarContrasenia;
    Button mButtonRegistrarse;
    TextView mTextViewIngresar;


    TextView mTextViewBlanco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrate);

        mTextNombreApellido = (EditText) findViewById(R.id.edittext_nombre_apellido);
        mTextCorreo = (EditText) findViewById(R.id.edittext_correo);
        mTextContrasenia = (EditText) findViewById(R.id.edittext_contrasenia);
        mTextConfirmarContrasenia = (EditText) findViewById(R.id.edittext_confirmar_contrasenia);
        mButtonRegistrarse = (Button) findViewById(R.id.button_registrar);
        mTextViewIngresar = (TextView) findViewById(R.id.textview_ingresar);

        mTextViewBlanco = (TextView) findViewById(R.id.textview_blanco);



        mTextViewIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingresarIntent = new Intent (v.getContext(),LoginActivity.class);
                startActivity(ingresarIntent);
            }
        });

        mButtonRegistrarse.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        final String correo = mTextCorreo.getText().toString();
        final String nombre = mTextNombreApellido.getText().toString();
        final String contrasenia = mTextContrasenia.getText().toString();
        //final int edad = Integer.parseInt(edad.getText().toString());


        final String aux = nombre+" "+correo+" "+contrasenia+""+"hahaha";




        mTextViewBlanco.setText(aux);

    }
}
