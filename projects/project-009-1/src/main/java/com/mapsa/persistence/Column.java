package com.mapsa.persistence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Esmaeil Sadeghi, 8/7/20 9:18 AM
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {

    String name() default "";

    String dataType() default "";

    boolean unique() default false;

    boolean nullable() default true;

    int length() default 255;
}
