package com.dianti.convertsuhu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class kelvin extends AppCompatActivity {
    EditText kelvin, celcius;
    Button btn_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin);


        celcius = (EditText)findViewById(R.id.et_celcius);
        kelvin = (EditText)findViewById(R.id.et_kelvin);
        btn_convert = (Button)findViewById(R.id.btn_convert);
    }
    public void konversisuhu (View view){
        try{
            int ncelcius = Integer.parseInt(celcius.getText().toString());
            double nkelvin = ncelcius+273.15;
            kelvin.setText(String.valueOf(nkelvin));


        }catch (Exception e){

            e.printStackTrace();
        }
    }


}
