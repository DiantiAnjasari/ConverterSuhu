package com.dianti.convertsuhu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FCelcius extends AppCompatActivity {
    EditText fahrenheit, celcius;
    Button btn_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcelcius);

        celcius = (EditText)findViewById(R.id.et_celcius);
        fahrenheit = (EditText)findViewById(R.id.et_fahrenheit);
        btn_convert = (Button)findViewById(R.id.btn_convert);
    }
    public void konversisuhu (View view){
        try{
            int nfahrenheit = Integer.parseInt(fahrenheit.getText().toString());
            double ncelcius = (nfahrenheit-32)* 5/9;
            celcius.setText(String.valueOf(ncelcius));


        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
