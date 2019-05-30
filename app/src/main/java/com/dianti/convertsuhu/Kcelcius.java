package com.dianti.convertsuhu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Kcelcius extends AppCompatActivity {

    EditText kelvin, celcius;
    Button btn_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kcelcius);

        celcius = (EditText)findViewById(R.id.et_celcius);
        kelvin = (EditText)findViewById(R.id.et_kelvin);
        btn_convert = (Button)findViewById(R.id.btn_convert);
    }
    public void konversisuhu (View view){
        try{
            int nkelvin = Integer.parseInt(kelvin.getText().toString());
            double ncelcius = (nkelvin-273.15) ;
            celcius.setText(String.valueOf(ncelcius));


        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
