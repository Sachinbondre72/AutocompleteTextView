package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView textView;
    String string[] = {"Pune","Patna","Ahmednagar","Amrawati","Nagpur","Mumbai","Merut","Ranchi","Delhi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.list);
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.select_dialog_item,string);
        textView.setThreshold(1);
        textView.setAdapter(arrayAdapter);

    }
}
