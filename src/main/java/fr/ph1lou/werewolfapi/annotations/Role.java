package fr.ph1lou.werewolfapi.annotations;

import fr.ph1lou.werewolfapi.enums.Category;
import fr.ph1lou.werewolfapi.enums.RoleAttribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Role {

    String key();

    String[] loreKey() default {};

    Category category();

    RoleAttribute[] attributes();

    float weight() default 1;

    boolean requireDouble() default false;

    String[] requireRoles() default {};

    String[] incompatibleRoles() default {};

    IntValue[] configValues() default {};

    Configuration[] configurations() default {};

    Timer[] timers() default {};
}