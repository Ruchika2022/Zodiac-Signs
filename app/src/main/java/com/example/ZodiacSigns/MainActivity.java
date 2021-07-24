package com.example.verzeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void aries(View view) {
        Intent intent = new Intent(this, AriesActivity.class);
        startActivity(intent);
    }
    public void aquarius(View view) {
        Intent intent = new Intent(this, AquariusActivity.class);
        startActivity(intent);
    }
    public void cancer(View view) {
        Intent intent = new Intent(this, CancerActivity.class);
        startActivity(intent);
    }
    public void capricorn(View view) {
        Intent intent = new Intent(this, CapricornActivity.class);
        startActivity(intent);
    }
    public void gemini(View view) {
        Intent intent = new Intent(this, geminiActivity.class);
        startActivity(intent);
    }
    public void leo(View view) {
        Intent intent = new Intent(this, LeoActivity.class);
        startActivity(intent);
    }
    public void libra(View view) {
        Intent intent = new Intent(this, LibraActivity.class);
        startActivity(intent);
    }
    public void pisces(View view) {
        Intent intent = new Intent(this, PiscesActivity.class);
        startActivity(intent);
    }
    public void sag(View view) {
        Intent intent = new Intent(this, SagittariusActivity.class);
        startActivity(intent);
    }
    public void scorpio(View view) {
        Intent intent = new Intent(this, ScorpioActivity.class);
        startActivity(intent);
    }
    public void taurus(View view) {
        Intent intent = new Intent(this, TaurusActivity.class);
        startActivity(intent);
    }
    public void virgo(View view) {
        Intent intent = new Intent(this, VirgoActivity.class);
        startActivity(intent);
    }
}