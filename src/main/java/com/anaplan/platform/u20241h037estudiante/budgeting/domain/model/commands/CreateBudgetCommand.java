package com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.commands;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record CreateBudgetCommand(

        UUID budgetId,
        UUID departmentId,
        String budgetStatus,
        LocalDate startDate,
        LocalDate endDate,
        BigDecimal totalAmount,
        String currency,
        String description


) {
}
