package com.adias.gestionestock.model.entities;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adress {
    @Column(name = "adress1")
    private String adress1;
    @Column(name = "adress2")
    private String adress2;
    @Column(name = "city")
    private String city;
    @Column(name = "cap")
    private String cap;
    @Column(name = "country")
    private String country;
}
