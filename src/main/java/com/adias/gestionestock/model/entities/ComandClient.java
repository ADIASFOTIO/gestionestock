package com.adias.gestionestock.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "comandClient")
public class ComandClient extends AbstractEntity{
    @Column(name = "code")
    private String code;
    @Column(name = "comanDate")
    private Instant comandDate;
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;
    @OneToMany(mappedBy = "comandClient")
    private List<OnlineCmndClient> onlineCmndClients;

}
