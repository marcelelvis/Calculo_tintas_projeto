package com.example.calculo_tintas_projeto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText altura, largura, tipotinta, demaos;
    TextView custo, qnttinta, qntmassa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        altura = findViewById(R.id.altura);
        largura = findViewById(R.id.largura);
        tipotinta = findViewById(R.id.tipotinta);
        demaos = findViewById(R.id.demaos);
        custo = findViewById(R.id.scusto);
        qnttinta = findViewById(R.id.stinta);
        qntmassa = findViewById(R.id.smassa);

    }

    public void Calculotinta(View view) {
        double tipotinta2 = Double.parseDouble(tipotinta.getText().toString());
        double altura2 = Double.parseDouble(altura.getText().toString());
        double largura2 = Double.parseDouble(largura.getText().toString());
        double demaos2 = Double.parseDouble(demaos.getText().toString());
        double custo2 = 0;
        double qnttinta2 = 0;
        double qntmassa2 = 0;
        double at;
        double rendimento = 0;
        double preco = 0;
        if (tipotinta2 == 1){
            rendimento = 66;
            preco = 90;
        } else if (tipotinta2 == 2) {
            rendimento = 76;
            preco = 130;
        } else if (tipotinta2 == 3){
            rendimento = 100;
            preco = 88;
        }


        at = (altura2 * largura2) * 4;
        qntmassa2 = at/17;
        qnttinta2 = (at*demaos2)/rendimento;
        custo2 = (qntmassa2*45) + (qnttinta2*preco);

        custo.setText(String.format("Irá gastar R$ " +  "%5.2f",custo2));
        qnttinta.setText(String.format("Galões de tinta: " +  "%5.2f" , qnttinta2));
        qntmassa.setText(String.format("Potes de massa: " +  "%5.2f" , qntmassa2));

    }


}