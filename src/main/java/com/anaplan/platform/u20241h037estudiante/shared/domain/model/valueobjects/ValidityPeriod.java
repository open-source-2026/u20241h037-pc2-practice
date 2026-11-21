package com.anaplan.platform.u20241h037estudiante.shared.domain.model.valueobjects;

import java.time.LocalDate;

public record ValidityPeriod(LocalDate startDate, LocalDate endDate) {

    /**
     * Constructs a ValidityPeriod with the specified start and end dates.
     *
     * @param startDate The start date of the validity period.
     * @param endDate   The end date of the validity period.
     * @throws IllegalArgumentException if either startDate or endDate is null, or if endDate is before startDate.
     */

    public ValidityPeriod {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Start date and end date cannot be null");
        }
        if (endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date cannot be before start date");
        }
    }

    /**
     * Checks if the validity period is currently active based on the current date.
     *
     * @return true if the current date is within the validity period, false otherwise.
     */
    public boolean isExpired(LocalDate checkDate) {
        return checkDate.isAfter(endDate);
    }
}
