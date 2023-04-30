package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Adress;
import lombok.Builder;
import lombok.Data;
@Data
public class AziendaDto {
    private Integer id;
    private String name;
    private String description;
    private Adress adress;
    private String fiscalCod;
    private String photo;
    private String mail;
    private String tel;
}
