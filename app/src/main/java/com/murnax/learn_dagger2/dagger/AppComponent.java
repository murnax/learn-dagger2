package com.murnax.learn_dagger2.dagger;

import com.murnax.learn_dagger2.car.Driver;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;

@Singleton
@Component(modules = { DriverModule.class })
public interface AppComponent {

    Driver getDriver();
}
