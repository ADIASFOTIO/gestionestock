package com.adias.gestionestock.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Table(name = "onlinecmndFornitore")
public class OnlineCmndFornitore extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "id_comandFornitore")
    private ComandFornitore comandFornitore;
}
