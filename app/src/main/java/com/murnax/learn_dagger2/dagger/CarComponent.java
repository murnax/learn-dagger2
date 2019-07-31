package com.murnax.learn_dagger2.dagger;

import com.murnax.learn_dagger2.MainActivity;
import com.murnax.learn_dagger2.car.Car;

import dagger.Component;

@Component(modules = { WheelsModule.class, DieselEngineModule.class })
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
