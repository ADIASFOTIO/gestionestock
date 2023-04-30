package com.adias.gestionestock.model.dto;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class AdressDto {
    private Integer id;
    private String adress1;
    private String adress2;
    private String city;
    private String cap;
    private String country;
}
