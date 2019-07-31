package com.murnax.learn_dagger2;

import android.app.Application;

import com.murnax.learn_dagger2.dagger.ActivityComponent;
import com.murnax.learn_dagger2.dagger.AppComponent;
import com.murnax.learn_dagger2.dagger.DaggerActivityComponent;

public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

//        component = Dagger.builder()
//                .horsePower(150)
//                .engineCapacity(1400)
//                .build();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
