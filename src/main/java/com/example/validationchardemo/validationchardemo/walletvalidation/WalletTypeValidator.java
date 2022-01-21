package com.example.validationchardemo.validationchardemo.walletvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WalletTypeValidator implements ConstraintValidator<WalletTypeValidation, String> {
    public boolean isValid(String wallet, ConstraintValidatorContext cxt) {
        Set<String> set = new HashSet<>(Arrays.asList("Virtual", "Physical", "Wallet"));
        return set.contains(wallet);
    }
}
