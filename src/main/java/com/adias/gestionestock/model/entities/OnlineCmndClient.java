package com.adias.gestionestock.model.entities;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "onlineCmndClient")
public class OnlineCmndClient extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "id_comandClient")
    private  ComandClient comandClient;
    @Column(name = "quantity")
    private BigDecimal quantity;
    @Column(name = "unitPrice")
    private BigDecimal unitPrice;

}
