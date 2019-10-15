package com.justin.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String Tag =MainActivity.class.getSimpleName();
    private EditText edWeight;
    private EditText edHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void findViews(){
        edWeight=findViewById(R.id.editWeight);
        edHeight=findViewById(R.id.editHeight);
    }
    public void bmi(){
        float weight= Float.parseFloat((edWeight.getText().toString()));
        float height= Float.parseFloat((edHeight.getText().toString()));
        float bmi =weight/(height*height);

    }
}
