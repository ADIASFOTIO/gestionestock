package com.adias.gestionestock.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity {
    @Column(name = "codeArticle")
    private String codeArticle;
    @Column(name = "description")
    private String description;
    @Column(name = "unitPriceWithoutTav")
    private BigDecimal unitPriceWithoutTav;
    @Column(name = "rateTav")
    private BigDecimal rateTav;
    @Column(name = "unitPriceWithTav")
    private BigDecimal unitPriceWithTav;
    @Column(name = "photo")
    private String photo;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

}
