package com.anaplan.platform.u20241h037estudiante.budgeting.infrastructure.persistence.jpa.converters;

import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects.DepartmentId;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.UUID;

@Converter(autoApply = false)
public class DepartmentIdPersistenceConverter implements AttributeConverter<DepartmentId, String> {


    @Override
    public String convertToDatabaseColumn(DepartmentId attribute) {
        return attribute == null ? null : attribute.value().toString();
    }

    @Override
    public DepartmentId convertToEntityAttribute(String dbData) {
        return  dbData == null ? null : new DepartmentId(UUID.fromString(dbData));
    }
}
