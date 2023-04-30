package com.adias.gestionestock.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "azienda")
public class Azienda extends AbstractEntity{
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Embedded
    private Adress adress;
    @Column(name = "fiscalCod")
    private String fiscalCod;
    @Column(name = "photo")
    private String photo;
    @Column(name = "mail")
    private String mail;
    @Column(name = "tel")
    private String tel;
}
