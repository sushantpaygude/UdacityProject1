package com.example.sushant.udacityproject1;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView titletext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("MyArsenalStore");
        titletext=(TextView)findViewById(R.id.text);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"fonts/Capture_it.ttf");
        titletext.setTypeface(typeface);
    }
}
