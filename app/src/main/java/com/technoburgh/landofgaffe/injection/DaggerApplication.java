package com.technoburgh.landofgaffe.injection;

import android.app.Application;

import com.technoburgh.landofgaffe.injection.modules.ApplicationModule;
import com.technoburgh.landofgaffe.injection.modules.RootModule;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

/**
 * Created by dgaffey on 11/10/14.
 */
public class DaggerApplication extends Application
{
   // private final FlowBundler flowBundler =  new FlowBundler();
    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();

        this.objectGraph = ObjectGraph.create(getModules().toArray());
    }

    protected List<Object> getModules() {
        return Arrays.asList(
                new RootModule(this),
                new ApplicationModule()
        );
    }

    public void inject(Object object) {
        this.objectGraph.inject(object);
    }
}