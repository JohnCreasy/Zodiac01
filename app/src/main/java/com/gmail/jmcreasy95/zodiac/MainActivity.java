package com.gmail.jmcreasy95.zodiac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //declaring edit texts
    EditText editTextMonth;
    EditText editTextDay;
    EditText editTextYear;

    //declaring buttons
    Button buttonValidate;
    Button buttonClear;
    Button buttonZodiac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
