package com.technoburgh.landofgaffe.injection.modules;

import com.technoburgh.landofgaffe.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dgaffey on 11/10/14.
 */

@Module(
        injects = { MainActivity.class },
        complete = false
)

public class ApplicationModule
{
}
