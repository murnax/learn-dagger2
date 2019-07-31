package com.murnax.learn_dagger2.car;

import android.util.Log;

import com.murnax.learn_dagger2.dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels =  wheels;
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " drives " + this);
    }
}
