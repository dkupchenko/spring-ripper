package info.kupchenko.demo.springripper.quoters;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Евгений Борисов
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DeprecatedClass {
    Class<?> newImpl();
}
