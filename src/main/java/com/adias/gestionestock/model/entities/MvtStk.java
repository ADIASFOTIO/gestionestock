package com.adias.gestionestock.model.entities;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.Instant;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "mvtStk")
public class MvtStk extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;
    @Column(name = "dateMvtStk")
    private Instant dateMvtStk;
    @Column(name = "quantity")
    private BigDecimal quantity;
    @Column(name = "typeMvtStk")
    private TypeMvtStk typeMvtStk;

}
