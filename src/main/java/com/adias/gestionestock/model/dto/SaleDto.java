package com.adias.gestionestock.model.dto;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
@Data
public class SaleDto {
    private Integer id;
    private String code;
    private Instant saleDate;
    private String coment;
}
