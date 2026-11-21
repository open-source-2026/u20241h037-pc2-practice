package com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.commands;

import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects.BudgetIdentifier;
import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects.BudgetStatus;
import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects.DepartmentId;
import com.anaplan.platform.u20241h037estudiante.shared.domain.model.valueobjects.MonetaryAmount;
import com.anaplan.platform.u20241h037estudiante.shared.domain.model.valueobjects.ValidityPeriod;

public record CreateBudgetCommand(

        BudgetIdentifier budgetIdentifier,
        DepartmentId departmentId,
        ValidityPeriod period,
        MonetaryAmount allocatedAmount,
        BudgetStatus status,
        String description

) {
}
