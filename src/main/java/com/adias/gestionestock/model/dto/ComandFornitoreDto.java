package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.ComandFornitore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Data
@Builder
public class ComandFornitoreDto {
    private Integer id;
    private String code;
    private Instant comandDate;
    private FornitoreDto fornitore;
    @JsonIgnore
    private List<OnlineCmndFornitoreDto> onlineCmndFornitores;
    public static ComandFornitoreDto fromEntity(ComandFornitore comandFornitore){
        if (comandFornitore == null){
            return null;
            //TODO throw an exception
        }

        return ComandFornitoreDto.builder()
                .id(comandFornitore.getId())
                .code(comandFornitore.getCode())
                .comandDate(comandFornitore.getComandDate())
                .fornitore(FornitoreDto.fromEntity(comandFornitore.getFornitore()))
                .build();
    }
    public static ComandFornitore toEntity(ComandFornitoreDto comandFornitoreDto){
        if (comandFornitoreDto == null){
            return null;
            //TODO throw an exception
        }
        ComandFornitore comandFornitore = new ComandFornitore();
        comandFornitore.setId(comandFornitoreDto.getId());
        comandFornitore.setCode(comandFornitoreDto.getCode());
        comandFornitore.setComandDate(comandFornitoreDto.getComandDate());
        comandFornitore.setFornitore(FornitoreDto.toEntity(comandFornitoreDto.getFornitore()));
        return comandFornitore;
    }
}
