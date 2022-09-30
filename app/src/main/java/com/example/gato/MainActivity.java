package com.example.gato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, limpiar;
    EditText xoy;
    int turno, contador = 0, contador2 = 0;
    char letra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        uno = (Button) findViewById(R.id.uno);
        dos = (Button) findViewById(R.id.dos);
        tres = (Button) findViewById(R.id.tres);
        cuatro = (Button) findViewById(R.id.cuatro);
        cinco = (Button) findViewById(R.id.cinco);
        seis = (Button) findViewById(R.id.seis);
        siete = (Button) findViewById(R.id.siete);
        ocho = (Button) findViewById(R.id.ocho);
        nueve = (Button) findViewById(R.id.nueve);
        limpiar = (Button) findViewById(R.id.limpiar);
        xoy = (EditText) findViewById(R.id.xoy);

        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        limpiar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        contador ++;
        turno = contador%2;

        if(turno == 1)
        {
            setValor('X', view);
        }

        else
        {
            setValor('0', view);
        }
        }


    private void setValor(char letra, View view) {

        if(view.getId() == R.id.limpiar)
        {
            finish();
            startActivity(getIntent());
        }

        if(view.getId() == R.id.uno)
        {
            uno.setText(letra + "");
            uno.setEnabled(false);
        }

        else if(view.getId() == R.id.dos)
        {
            dos.setText(letra + "");
            dos.setEnabled(false);
        }

        else if(view.getId() == R.id.tres)
        {
            tres.setText(letra + "");
            tres.setEnabled(false);
        }

        else if(view.getId() == R.id.cuatro)
        {
            cuatro.setText(letra + "");
            cuatro.setEnabled(false);
        }

        else if(view.getId() == R.id.cinco)
        {
            cinco.setText(letra + "");
            cinco.setEnabled(false);
        }

        else if(view.getId() == R.id.seis)
        {
            seis.setText(letra + "");
            seis.setEnabled(false);
        }

        else if(view.getId() == R.id.siete)
        {
            siete.setText(letra + "");
            siete.setEnabled(false);
        }

        else if(view.getId() == R.id.ocho)
        {
            ocho.setText(letra + "");
            ocho.setEnabled(false);
        }

        else
        {
            nueve.setText(letra + "");
            nueve.setEnabled(false);
        }

        Ganador(letra);
    }

    private void Ganador(char letra) {
        if(uno.getText().toString().equals(letra + "") && (dos.getText().toString().equals(letra + "")) && (tres.getText().toString().equals(letra + ""))) {
            xoy.setText(""+letra);
            xoy.setEnabled(false);
            cuatro.setEnabled(false);
            cinco.setEnabled(false);
            seis.setEnabled(false);
            siete.setEnabled(false);
            ocho.setEnabled(false);
            nueve.setEnabled(false);
        }

        else if(cuatro.getText().toString().equals(letra + "") && (cinco.getText().toString().equals(letra + "")) && (seis.getText().toString().equals(letra + "")))
        {
            xoy.setText(""+letra);
            xoy.setEnabled(false);
            uno.setEnabled(false);
            dos.setEnabled(false);
            tres.setEnabled(false);
            siete.setEnabled(false);
            ocho.setEnabled(false);
            nueve.setEnabled(false);
        }

        else if(siete.getText().toString().equals(letra + "") && (ocho.getText().toString().equals(letra + "")) && (nueve.getText().toString().equals(letra + "")))
        {
            xoy.setText(""+letra);
            xoy.setEnabled(false);
            uno.setEnabled(false);
            dos.setEnabled(false);
            tres.setEnabled(false);
            cuatro.setEnabled(false);
            cinco.setEnabled(false);
            seis.setEnabled(false);
        }

        else if(uno.getText().toString().equals(letra + "") && (cuatro.getText().toString().equals(letra + "")) && (siete.getText().toString().equals(letra + "")))
        {
            xoy.setText(""+letra);
            xoy.setEnabled(false);
            dos.setEnabled(false);
            tres.setEnabled(false);
            cinco.setEnabled(false);
            seis.setEnabled(false);
            ocho.setEnabled(false);
            nueve.setEnabled(false);
        }

        else if(dos.getText().toString().equals(letra + "") && (cinco.getText().toString().equals(letra + "")) && (ocho.getText().toString().equals(letra + "")))
        {
            xoy.setText(""+letra);
            xoy.setEnabled(false);
            uno.setEnabled(false);
            tres.setEnabled(false);
            cuatro.setEnabled(false);
            seis.setEnabled(false);
            siete.setEnabled(false);
            nueve.setEnabled(false);
        }

        else if(tres.getText().toString().equals(letra + "") && (seis.getText().toString().equals(letra + "")) && (nueve.getText().toString().equals(letra + "")))
        {
            xoy.setText(""+letra);
            xoy.setEnabled(false);
            uno.setEnabled(false);
            dos.setEnabled(false);
            cuatro.setEnabled(false);
            cinco.setEnabled(false);
            siete.setEnabled(false);
            ocho.setEnabled(false);
        }

        else if(uno.getText().toString().equals(letra + "") && (cinco.getText().toString().equals(letra + "")) && (nueve.getText().toString().equals(letra + "")))
        {
            xoy.setText(""+letra);
            xoy.setEnabled(false);
            dos.setEnabled(false);
            tres.setEnabled(false);
            cuatro.setEnabled(false);
            seis.setEnabled(false);
            siete.setEnabled(false);
            ocho.setEnabled(false);
        }

        else if(tres.getText().toString().equals(letra + "") && (cinco.getText().toString().equals(letra + "")) && (siete.getText().toString().equals(letra + "")))
        {
            xoy.setText(""+letra);
            xoy.setEnabled(false);
            uno.setEnabled(false);
            dos.setEnabled(false);
            cuatro.setEnabled(false);
            seis.setEnabled(false);
            ocho.setEnabled(false);
            nueve.setEnabled(false);
        }

        else if (contador2 < 9) {
            contador2++;
        }
        else
        {
            xoy.setText("Empate");
            xoy.setEnabled(false);
            uno.setEnabled(false);
            dos.setEnabled(false);
            tres.setEnabled(false);
            cuatro.setEnabled(false);
            cinco.setEnabled(false);
            seis.setEnabled(false);
            siete.setEnabled(false);
            ocho.setEnabled(false);
            nueve.setEnabled(false);
        }


    }

}