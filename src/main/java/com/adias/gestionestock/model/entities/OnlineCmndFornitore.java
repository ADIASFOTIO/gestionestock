package com.adias.gestionestock.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "onlinecmndFornitore")
public class OnlineCmndFornitore extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "id_comandFornitore")
    private ComandFornitore comandFornitore;
    @Column(name = "quantity")
    private BigDecimal quantity;
    @Column(name = "unitPrice")
    private BigDecimal unitPrice;
}
