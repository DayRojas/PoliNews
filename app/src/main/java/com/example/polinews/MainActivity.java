package com.example.polinews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void info_Internacional (View view) {
        Intent i=new Intent(this, infoInternacional.class);
    startActivity(i);
    }
    public void info_Economia (View view) {
        Intent intention=new Intent(this, infoEconomia.class);
        startActivity(intention);
    }
    public void info_Tecnologia (View view) {
        Intent intent=new Intent(this, InfoTecnologia.class);
        startActivity(intent);
    }
}