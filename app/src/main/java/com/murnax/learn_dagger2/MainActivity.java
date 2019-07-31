package com.murnax.learn_dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.murnax.learn_dagger2.car.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CarComponent carComponent = DaggerCarComponent.create();
//        carComponent.inject(this);
//        car.drive();
    }
}
