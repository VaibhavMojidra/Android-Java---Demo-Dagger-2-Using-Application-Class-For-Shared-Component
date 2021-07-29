package com.vaibhavmojidra.dagger2usingapplicationclassforsharedcomponentjava;

import android.app.Application;

public class SmartPhoneApplication extends Application {
    SmartPhoneComponent smartPhoneComponent;
    @Override
    public void onCreate() {
        smartPhoneComponent=initDagger();
        super.onCreate();
    }
    private SmartPhoneComponent initDagger(){
       return DaggerSmartPhoneComponent.create();
    }
}
