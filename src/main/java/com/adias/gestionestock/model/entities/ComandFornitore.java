package com.adias.gestionestock.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "comandFornitore")
public class ComandFornitore extends AbstractEntity{
    @Column(name = "code")
    private String code;
    @Column(name = "comandDate")
    private Instant comandDate;
    @ManyToOne
    @JoinColumn(name = "id_fornitore")
    private Fornitore fornitore;
    @OneToMany(mappedBy = "comandFornitore")
    private List<OnlineCmndFornitore> onlineCmndFornitores;
}
