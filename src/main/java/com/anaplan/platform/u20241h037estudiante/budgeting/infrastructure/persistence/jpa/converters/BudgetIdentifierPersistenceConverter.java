package com.anaplan.platform.u20241h037estudiante.budgeting.infrastructure.persistence.jpa.converters;

import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects.BudgetIdentifier;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class BudgetIdentifierPersistenceConverter implements AttributeConverter<BudgetIdentifier, String> {

    @Override
    public String convertToDatabaseColumn(BudgetIdentifier attribute) {
        return attribute == null ? null : attribute.value().toString();
    }

    @Override
    public BudgetIdentifier convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new BudgetIdentifier(java.util.UUID.fromString(dbData));
    }
}
