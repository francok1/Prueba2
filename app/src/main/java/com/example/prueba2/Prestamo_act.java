package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Prestamo;

public class Prestamo_act extends AppCompatActivity {

    private Spinner spinCliente, spinCredito;
    private TextView txt;
    private Button calcularPrestamos, calcularDeudas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prestamos_act);

        spinCliente = (Spinner) findViewById(R.id.spnClientes);
        spinCredito = (Spinner) findViewById(R.id.spnCreditos);

        txt = (TextView) findViewById(R.id.tvPrestamo);

        ArrayList<String> listaClientes = (ArrayList<String>) getIntent().getSerializableExtra("listaClientes");
        ArrayList<String> listaCreditos = (ArrayList<String>) getIntent().getSerializableExtra("listaCreditos");


        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaClientes);
        ArrayAdapter<String> adapts = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaCreditos);

        spinCliente.setAdapter(adapt);
        spinCredito.setAdapter(adapts);
    }

    public void CalcularPrestamo(View v) {

        String cliente = spinCliente.getSelectedItem().toString();
        String credito = spinCredito.getSelectedItem().toString();

        Prestamo prestamo = new Prestamo();
        int Saldo = prestamo.Prestamo(cliente, credito);
        txt.setText("Saldo: "+Saldo);

    }

    public void CalcularDeudas(View v) {

        String cliente = spinCliente.getSelectedItem().toString();
        String credito = spinCredito.getSelectedItem().toString();

        Prestamo prestamo = new Prestamo();
        int Saldo = prestamo.Deuda(cliente, credito);
        txt.setText("Deuda: "+Saldo);

    }
}
