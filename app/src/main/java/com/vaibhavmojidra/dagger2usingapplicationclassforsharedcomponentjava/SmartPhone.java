package com.vaibhavmojidra.dagger2usingapplicationclassforsharedcomponentjava;

import android.util.Log;

import javax.inject.Inject;

public class SmartPhone {
    private Battery battery;
    private SimCard simCard;
    private MemoryCard memoryCard;

    @Inject
    public SmartPhone(Battery battery, SimCard simCard, MemoryCard memoryCard) {
        this.battery = battery;
        this.simCard = simCard;
        this.memoryCard = memoryCard;
        Log.i("MyInfo","Battery, SimCard, MemoryCard initialized via constructor");
    }

    protected void startCallRecording(){
        battery.getPowerAvailability();
        simCard.getConnected();
        memoryCard.getSpaceAvailability();
        Log.i("MyInfo","Started Call recording...");
    }
}
