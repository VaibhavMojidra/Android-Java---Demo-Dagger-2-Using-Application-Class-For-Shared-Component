package com.vaibhavmojidra.dagger2usingapplicationclassforsharedcomponentjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((SmartPhoneApplication)getApplication())
                .smartPhoneComponent
                .getSmartPhone()
                .startCallRecording();// Injecting via dagger 2
    }
}