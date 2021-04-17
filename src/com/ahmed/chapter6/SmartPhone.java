package com.ahmed.chapter6;

import java.lang.annotation.*;


@Inherited
//The default retention policy type is CLASS.
@Retention(RetentionPolicy.CLASS)
public @interface SmartPhone {
    String os() default "Android";
    int version() default 11;



}
