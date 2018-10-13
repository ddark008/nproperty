package jfork.nproperty;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * CfgIgnore annotation represent ignore field of class.
 * 
 * @see {@link Cfg#ignore()}
 * @author zcxv
 * @date 13.10.2018
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface CfgIgnore {

}
