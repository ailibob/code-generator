package bob.code.generator.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/***
 * 注释描述
 */
@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Description {
    String value();
}
