package com.dianti.convertsuhu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Kfahrenheit extends AppCompatActivity {

    EditText fahrenheit, kelvin;
    Button btn_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kfahrenheit);

        kelvin = (EditText)findViewById(R.id.et_kelvin);
        fahrenheit = (EditText)findViewById(R.id.et_fahrenheit);
        btn_convert = (Button)findViewById(R.id.btn_convert);
    }
    public void konversisuhu (View view){
        try{
            int nkelvin = Integer.parseInt(kelvin.getText().toString());
            double nfahrenheit = (nkelvin - 273.15) * 9/5 + 32;
            fahrenheit.setText(String.valueOf(nfahrenheit));


        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
