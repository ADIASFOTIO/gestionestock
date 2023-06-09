package com.adias.gestionestock.model.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import java.time.Instant;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "sale")
public class Sale extends AbstractEntity{
    @Column(name = "code")
    private String code;
    @Column(name = "saleDate")
    private Instant saleDate;
    @Column(name = "coment")
    private String coment;
}
