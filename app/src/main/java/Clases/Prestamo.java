package Clases;


import android.widget.Spinner;
import android.widget.TextView;

import com.example.prueba2.Prestamo_act;
import com.example.prueba2.R;

import java.text.BreakIterator;

public class Prestamo {

    private int prestamo;
    private int deuda;

    public int Prestamo(String a, String b){

        if (a.equals("Axel") && b.equals("Credito Hipotecario")) {

            prestamo = 1750000;

        } else if (a.equals("Axel") && b.equals("Credito Automotriz")) {

            prestamo = 1250000;

        } else if (a.equals("Roxana") && b.equals("Credito Hipotecario")) {

            prestamo = 1900000;

        } else if (a.equals("Roxana") && b.equals("Credito Automotriz")) {

            prestamo = 1400000;

        }
        return prestamo;
    }

    public int Deuda(String a , String b){
        if (a.equals("Axel") && b.equals("Credito Hipotecario")) {

            deuda = 1750000/12;

        } else if (a.equals("Axel") && b.equals("Credito Automotriz")) {

            deuda = 1250000/8;

        } else if (a.equals("Roxana") && b.equals("Credito Hipotecario")) {

            deuda = 1900000/12;

        } else if (a.equals("Roxana") && b.equals("Credito Automotriz")) {

            deuda = 1400000/8;

        }
            return deuda;}
}
