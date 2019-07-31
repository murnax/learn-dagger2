package com.murnax.learn_dagger2.dagger;

import com.murnax.learn_dagger2.car.DieselEngine;
import com.murnax.learn_dagger2.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
