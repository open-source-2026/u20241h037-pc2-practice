package com.anaplan.platform.u20241h037estudiante.shared.infrastructure.persistence.jpa.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class MonetaryAmountEmbeddable {

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "amount", nullable = false)
    private double amount;

    public MonetaryAmountEmbeddable() {
    }

    public MonetaryAmountEmbeddable(String currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }
}
