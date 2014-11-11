package com.technoburgh.landofgaffe.injection.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by dgaffey on 11/10/14.
 */
@Qualifier @Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationScope
{
}
