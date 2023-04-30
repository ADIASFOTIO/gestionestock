package com.adias.gestionestock.model.entities;
import jakarta.persistence.*;
import lombok.*;
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
    @Column(name = "quantity")
    private BigDecimal quantity;
    @Column(name = "unitPrice")
    private BigDecimal unitPrice;

}
