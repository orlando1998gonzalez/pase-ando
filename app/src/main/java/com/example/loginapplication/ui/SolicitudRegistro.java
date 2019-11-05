package com.example.loginapplication.ui;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class SolicitudRegistro extends StringRequest {
    private static final String SOLICITUD_REGISTRO_URL="http://192.168.1.72/register.php\n"; //http://localhost/register.php
    private Map<String, String> params;
    public SolicitudRegistro(String correo, String nombre, String contrasenia, Response.Listener<String> listener){
        super(Method.POST, SOLICITUD_REGISTRO_URL, listener,null);
        params=new HashMap<>();
        params.put("correo",correo);
        params.put("nombre",nombre);

        //params.put("edad",edad+""); //entero a cadena
        params.put("contrasenia",contrasenia);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
