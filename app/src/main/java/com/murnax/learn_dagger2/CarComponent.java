package com.murnax.learn_dagger2;

import dagger.Component;

@Component(modules = { WheelsModule.class, PetrolEngineModule.class })
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
