package academy.learnprogramming;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// indicates the context where the annotation type is applicable
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
// indicates how long annotation with the annotated type are to be retained
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface MaxNumber {
}
