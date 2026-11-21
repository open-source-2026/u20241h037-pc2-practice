package com.anaplan.platform.u20241h037estudiante.shared.domain.model.valueobjects;

import java.math.BigDecimal;

public record MonetaryAmount(BigDecimal value, String currency) {


    /**
     * Constructs a MonetaryAmount with the specified value and currency.
     *
     * @param value    The monetary value. Must be greater than zero.
     * @param currency The currency code (e.g., "USD", "EUR"). Cannot be null or blank.
     * @throws IllegalArgumentException if the value is less than or equal to zero, or if the currency is null or blank.
     */

    public MonetaryAmount {
        if (currency == null || currency.isBlank()) {
            throw new IllegalArgumentException("Currency cannot be null or blank");
        }

        if (value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Value cannot be negative or zero");
        }

    }

    /**
     * Multiplies the monetary amount by a given factor.
     *
     * @param factor The factor to multiply by. Must be greater than or equal to zero.
     * @return A new MonetaryAmount representing the result of the multiplication.
     * @throws IllegalArgumentException if the factor is null or less than zero.
     */

    public MonetaryAmount multiply(BigDecimal factor) {
        if (factor == null) {
            throw new IllegalArgumentException("Factor cannot be null");
        }
        if (factor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Factor must be greater than or equal to zero");
        }

        BigDecimal newValue = value.multiply(factor);
        return new MonetaryAmount(newValue, currency);
    }

}
