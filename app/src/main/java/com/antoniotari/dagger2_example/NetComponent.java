package com.antoniotari.dagger2_example;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by antonio.tari on 11/8/16.
 */
@Singleton
@Component (modules={AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
    // void inject(MyFragment fragment);
    // void inject(MyService service);
}
