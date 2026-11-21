package com.anaplan.platform.u20241h037estudiante.budgeting.infrastructure.persistence.jpa.entities;


import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects.BudgetIdentifier;
import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects.BudgetStatus;
import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects.DepartmentId;
import com.anaplan.platform.u20241h037estudiante.budgeting.infrastructure.persistence.jpa.converters.BudgetIdentifierPersistenceConverter;
import com.anaplan.platform.u20241h037estudiante.budgeting.infrastructure.persistence.jpa.converters.DepartmentIdPersistenceConverter;
import com.anaplan.platform.u20241h037estudiante.shared.domain.model.valueobjects.MonetaryAmount;
import com.anaplan.platform.u20241h037estudiante.shared.infrastructure.persistence.jpa.embeddables.ValidityPeriodEmbeddable;
import com.anaplan.platform.u20241h037estudiante.shared.infrastructure.persistence.jpa.entities.AuditableAbstractPersistenceEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "budget")
@Getter
@Setter
@NoArgsConstructor
public class BudgetEntity extends AuditableAbstractPersistenceEntity {



    @Convert(converter = BudgetIdentifierPersistenceConverter.class)
    @Column(nullable = false, unique = true)
    private BudgetIdentifier budgetIdentifier;

    @Convert(converter = DepartmentIdPersistenceConverter.class)
    @Column(nullable = false)
    private DepartmentId departmentId;

    @Embedded
    private ValidityPeriodEmbeddable period;

    @Embedded
    private MonetaryAmount allocatedAmount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BudgetStatus status;

    @Column(nullable = false)
    private String description;



}
