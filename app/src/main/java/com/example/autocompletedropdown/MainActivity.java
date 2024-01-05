package com.example.autocompletedropdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] city={"Rajkot","Upleta","Ahemdabad","Rajpara","Amreli","Bhavnagar","bhayavadar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autocomplatetext);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,city);
        autoCompleteTextView.setAdapter(arrayAdapter);

    }
}