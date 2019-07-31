package com.murnax.learn_dagger2.dagger;

import com.murnax.learn_dagger2.car.Engine;
import com.murnax.learn_dagger2.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
