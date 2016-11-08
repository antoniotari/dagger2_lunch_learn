package com.antoniotari.dagger2_example;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by antonio tari on 11/8/16.
 * @see <a href ="https://guides.codepath.com/android/Dependency-Injection-with-Dagger-2">Dagger2 tutorial</a>
 *
 */
@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides @Singleton
    Application providesApplication() {
        return mApplication;
    }

    @Provides @Singleton @ForApplication
    Context providesApplicationContext() {
        return mApplication.getApplicationContext();
    }
}