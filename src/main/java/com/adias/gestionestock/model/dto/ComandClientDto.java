package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Azienda;
import com.adias.gestionestock.model.entities.ComandClient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Data
@Builder
public class ComandClientDto {
    private Integer id;
    private String code;
    private Instant comandDate;
    private ClientDto client;
    @JsonIgnore
    private List<OnlineCmndClientDto> onlineCmndClients;
    public static ComandClientDto fromEntity(ComandClient comandClient){
        if (comandClient == null){
            return null;
            //TODO throw an exception
        }

        return ComandClientDto.builder()
                .id(comandClient.getId())
                .code(comandClient.getCode())
                .comandDate(comandClient.getComandDate())
                .client(ClientDto.fromEntity(comandClient.getClient()))
                .build();
    }
    public static ComandClient toEntity(ComandClientDto comandClientDto){
        if (comandClientDto == null){
            return null;
            //TODO throw an exception
        }
        ComandClient comandClient = new ComandClient();
        comandClient.setId(comandClientDto.getId());
        comandClient.setCode(comandClientDto.getCode());
        comandClient.setComandDate(comandClientDto.getComandDate());
        comandClient.setClient(ClientDto.toEntity(comandClientDto.getClient()));
        return comandClient;
    }
}
