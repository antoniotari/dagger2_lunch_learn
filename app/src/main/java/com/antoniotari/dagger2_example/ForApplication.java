package com.antoniotari.dagger2_example;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by antoniotari on 2016-01-13.
 *
 * @see <a href="https://github.com/square/dagger/blob/master/examples/android-activity-graphs/src/main/java/com/example/dagger/activitygraphs/ForApplication.java">Modified
 * from Dagger Sample Application</a>
 *
 * @see <a href="https://github.com/square/dagger/blob/master/examples/android-activity-graphs/src/main/java/com/example/dagger/activitygraphs/ForApplication.java">Modified from Dagger Sample Application</a>
 *
 * explanation of @Qualifier notifier
 * @see <a href="https://docs.oracle.com/javaee/6/tutorial/doc/gjbck.html"</a>
 */

@Qualifier
@Retention (RUNTIME)
public @interface ForApplication {
}