package com.adias.gestionestock.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "onlineSale")
public class OnlineSale extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "id_sale")
    private Sale sale;
    private BigDecimal quantity;

}
