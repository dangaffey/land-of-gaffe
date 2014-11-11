package com.technoburgh.landofgaffe.injection.modules;

import android.content.Context;

import com.technoburgh.landofgaffe.injection.DaggerApplication;
import com.technoburgh.landofgaffe.injection.annotations.ApplicationScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dgaffey on 11/10/14.
 */
@Module(library = true)
public class RootModule
{
    private final DaggerApplication application;

    public RootModule(DaggerApplication application)
    {
        this.application = application;
    }

    @Provides
    @Singleton
    @ApplicationScope
    Context provideApplicationContext()
    {
        return this.application;
    }

}
