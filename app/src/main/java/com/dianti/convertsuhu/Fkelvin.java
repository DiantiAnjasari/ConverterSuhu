package com.dianti.convertsuhu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Fkelvin extends AppCompatActivity {

    EditText fahrenheit, kelvin;
    Button btn_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fkelvin);

        kelvin = (EditText)findViewById(R.id.et_kelvin);
        fahrenheit = (EditText)findViewById(R.id.et_fahrenheit);
        btn_convert = (Button)findViewById(R.id.btn_convert);
    }
    public void konversisuhu (View view){
        try{
            int nfahrenheit = Integer.parseInt(fahrenheit.getText().toString());
            double nkelvin = (nfahrenheit-32)* 5/9+ 273.15;
            kelvin.setText(String.valueOf(nkelvin));


        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
