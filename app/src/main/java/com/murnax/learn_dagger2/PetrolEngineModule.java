package com.murnax.learn_dagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {
    @Provides
    Engine provideEngine(PetrolEngine engine) {
        return engine;
    }
}
