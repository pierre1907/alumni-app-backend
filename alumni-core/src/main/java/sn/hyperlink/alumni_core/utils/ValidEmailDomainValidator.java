package sn.hyperlink.alumni_core.utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class ValidEmailDomainValidator implements ConstraintValidator<ValidEmailDomain, String> {

    private final List<String> allowedEmailDomains = Arrays.asList("ism.edu.sn", "groupeism.sn");

    @Override
    public void initialize(ValidEmailDomain constraintAnnotation) {
        // No initialization needed
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if (email == null) {
            return false;
        }

        // Extract domain part from email
        String[] parts = email.split("@");
        if (parts.length != 2) {
            return false;
        }

        // Check if domain is allowed
        return allowedEmailDomains.contains(parts[1]);
    }
}
