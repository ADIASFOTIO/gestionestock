package com.adias.gestionestock.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "fornitore")
public class Fornitore extends AbstractEntity{
    private String firstname;
    private String lastname;
    @Embedded
    private Adress adress;
    @Column(name = "photo")
    private String photo;
    @Column(name = "mail")
    private String mail;
    @Column(name = "tel")
    private String tel;
    @OneToMany(mappedBy = "fornitore")
    List<ComandFornitore> comandFornitores;
}
