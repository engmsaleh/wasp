package com.orhanobut.wasp.http;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Make a PUT request to a REST path relative to base URL
 *
 * @author Orhan Obut
 */
@Documented
@Target(METHOD)
@Retention(RUNTIME)
@RestMethod(value = "PUT", hasBody = true)
public @interface PUT {
    String value();
}
