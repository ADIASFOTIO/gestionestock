package com.adias.gestionestock.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
    protected ComandClient comandClient;

}
