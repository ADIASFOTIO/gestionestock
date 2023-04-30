package com.adias.gestionestock.model.dto;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Data
public class ComandFornitoreDto {
    private Integer id;
    private String code;
    private Instant comandDate;
    private FornitoreDto fornitore;
    private List<OnlineCmndFornitoreDto> onlineCmndFornitores;
}
