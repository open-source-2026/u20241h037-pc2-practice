package com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.agreggates;

import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects.BudgetIdentifier;
import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects.BudgetStatus;
import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects.DepartmentId;
import com.anaplan.platform.u20241h037estudiante.shared.domain.model.valueobjects.MonetaryAmount;
import com.anaplan.platform.u20241h037estudiante.shared.domain.model.valueobjects.ValidityPeriod;

import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.commands.CreateBudgetCommand;


public class Budget {

    private Long id;
    private BudgetIdentifier budgetIdentifier;
    private DepartmentId departmentId;
    private ValidityPeriod period;
    private MonetaryAmount allocatedAmount;
    private BudgetStatus status;
    private String description;

    // Constructor with validations

    public Budget(BudgetIdentifier budgetIdentifier, DepartmentId departmentId, ValidityPeriod period, MonetaryAmount allocatedAmount, BudgetStatus status, String description) {
        if (budgetIdentifier == null) {
            throw new IllegalArgumentException("BudgetIdentifier cannot be null");
        }
        if (departmentId == null) {
            throw new IllegalArgumentException("DepartmentId cannot be null");
        }
        if (period == null) {
            throw new IllegalArgumentException("ValidityPeriod cannot be null");
        }
        if (allocatedAmount == null) {
            throw new IllegalArgumentException("AllocatedAmount cannot be null");
        }
        if (status == null) {
            throw new IllegalArgumentException("BudgetStatus cannot be null");
        }
        this.budgetIdentifier = budgetIdentifier;
        this.departmentId = departmentId;
        this.period = period;
        this.allocatedAmount = allocatedAmount;
        this.status = status;
        this.description = description;
    }

    // Reconstitute

    public static Budget reconstitute(Long id, BudgetIdentifier budgetIdentifier, DepartmentId departmentId, ValidityPeriod period, MonetaryAmount allocatedAmount, BudgetStatus status, String description) {
        Budget budget = new Budget(budgetIdentifier, departmentId, period, allocatedAmount, status, description);
        budget.id = id;
        return budget;
    }

    // Command CreateBudgetCommand

    public Budget(CreateBudgetCommand command) {
       this.allocatedAmount = command.allocatedAmount();
       this.budgetIdentifier = command.budgetIdentifier();
       this.departmentId = command.departmentId();
       this.period = command.period();
       this.status = command.status();
       this.description = command.description();
    }

}