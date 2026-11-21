package com.anaplan.platform.u20241h037estudiante.budgeting.domain.repositories;

import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.agreggates.Budget;
import com.anaplan.platform.u20241h037estudiante.budgeting.domain.model.valueobjects.BudgetIdentifier;

public interface BudgetRepository {

    /**
     * Saves a {@link Budget} entity to the repository.
     *
     * @param budget The {@link Budget} entity to save.
     * @return The saved {@link Budget} entity.
     */
    Budget save(Budget budget);

    /**
     * Checks if a {@link Budget} entity exists in the repository by its {@link BudgetIdentifier}.
     *
     * @param budgetIdentifier The {@link BudgetIdentifier} to check for existence.
     * @return true if a {@link Budget} entity with the given {@link BudgetIdentifier} exists, false otherwise.
     */
    boolean existsByBudgetIdentifier(BudgetIdentifier budgetIdentifier);
}
