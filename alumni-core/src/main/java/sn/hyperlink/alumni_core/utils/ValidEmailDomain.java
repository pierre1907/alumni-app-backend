package sn.hyperlink.alumni_core.utils;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Email;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidEmailDomainValidator.class)
@Email(message = "Email non valide")
@ReportAsSingleViolation
public @interface ValidEmailDomain {
    String message() default "L'email doit être de domaine @ism.edu.sn ou @groupeism.sn";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
