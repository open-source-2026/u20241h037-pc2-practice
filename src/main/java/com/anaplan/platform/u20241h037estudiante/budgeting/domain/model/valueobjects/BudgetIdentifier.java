package com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects;

import java.util.UUID;

public record BudgetIdentifier(UUID value) {
    public BudgetIdentifier {
        if (value == null) {
            throw new IllegalArgumentException("BudgetIdentifier value cannot be null");
        }
    }
}
