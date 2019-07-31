package com.murnax.learn_dagger2.dagger;

import com.murnax.learn_dagger2.car.Rims;
import com.murnax.learn_dagger2.car.Tires;
import com.murnax.learn_dagger2.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims() {
        return new Rims();
    }

    @Provides
    Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
