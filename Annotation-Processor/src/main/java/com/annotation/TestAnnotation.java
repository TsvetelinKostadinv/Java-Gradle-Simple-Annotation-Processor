/**
 * 
 */
package com.annotation;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Tsvetelin
 */
@Documented
@Retention(CLASS)
@Target({ TYPE, FIELD, METHOD, CONSTRUCTOR })
public @interface TestAnnotation {

}
