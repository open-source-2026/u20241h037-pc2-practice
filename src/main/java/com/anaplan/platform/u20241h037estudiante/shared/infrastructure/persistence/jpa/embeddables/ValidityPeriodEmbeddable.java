package com.anaplan.platform.u20241h037estudiante.shared.infrastructure.persistence.jpa.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Embeddable
public class ValidityPeriodEmbeddable {

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    public ValidityPeriodEmbeddable() {
    }

    public ValidityPeriodEmbeddable(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }


}
