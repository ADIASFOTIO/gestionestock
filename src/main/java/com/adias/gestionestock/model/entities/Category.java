package com.adias.gestionestock.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "category")
public class Category extends AbstractEntity{
    @Column(name = "code")
    private String code;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "category")
    private List<Article> articles;
}
