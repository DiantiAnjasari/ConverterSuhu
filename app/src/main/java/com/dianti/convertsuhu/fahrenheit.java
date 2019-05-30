package com.dianti.convertsuhu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class fahrenheit extends AppCompatActivity {
    EditText fahrenheit, celcius;
    Button btn_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit);

        celcius = (EditText)findViewById(R.id.et_celcius);
        fahrenheit = (EditText)findViewById(R.id.et_fahrenheit);
        btn_convert = (Button)findViewById(R.id.btn_convert);
    }
    public void konversisuhu (View view){
        try{
            int ncelcius = Integer.parseInt(celcius.getText().toString());
            double nfahrenheit = ncelcius*1.8+32;
            fahrenheit.setText(String.valueOf(nfahrenheit));


        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
