package com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects;

import java.util.UUID;

public record DepartmentId(UUID value) {
    public DepartmentId {
        if (value == null) {
            throw new IllegalArgumentException("DepartmentId value cannot be null");
        }
    }
}
