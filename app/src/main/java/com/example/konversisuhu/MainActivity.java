package com.example.konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText vCelc, vKelvin, vFahrenheit, vReamur;

protected double ycelc, ykelv, yfahr, yream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vCelc = (EditText) findViewById(R.id.editcelcius);
        vKelvin = (EditText) findViewById(R.id.editkelvin);
        vFahrenheit = (EditText) findViewById(R.id.editfahrenheit);
        vReamur = (EditText) findViewById(R.id.editreamur);

        Button vButtonKonversi = (Button) findViewById(R.id.konversi);

        vButtonKonversi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
         String ycelc = (vCelc.getText().toString().trim());
//        ykelv = Double.parseDouble(vKelvin.getText().toString().trim());
//        yfahr = Double.parseDouble(vFahrenheit.getText().toString().trim());
//        yream = Double.parseDouble(vReamur.getText().toString().trim());
        double celc = Double.parseDouble(ycelc);

        double kelv = celc + 273;
        double fahr = 1.8 * celc +32;
        double ream = 0.8 * celc;

vKelvin.setText(kelv+"");
vFahrenheit.setText(fahr+"");
vReamur.setText(ream+"");

    }
}
