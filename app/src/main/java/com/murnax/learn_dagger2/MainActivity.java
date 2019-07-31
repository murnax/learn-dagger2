package com.murnax.learn_dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.murnax.learn_dagger2.car.Car;
import com.murnax.learn_dagger2.dagger.CarComponent;
import com.murnax.learn_dagger2.dagger.DaggerCarComponent;
import com.murnax.learn_dagger2.dagger.DieselEngineModule;

import javax.inject.Inject;

import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent
                .builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();
        carComponent.inject(this);
        car.drive();
    }
}
