package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Adress;
import com.adias.gestionestock.model.entities.Client;
import com.adias.gestionestock.model.entities.Fornitore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class FornitoreDto {
    private Integer id;
    private String firstname;
    private String lastname;
    private Adress adress;
    private String photo;
    private String mail;
    private String tel;
    @JsonIgnore
    List<ComandFornitoreDto> comandFornitores;
    public static FornitoreDto fromEntity(Fornitore fornitore){
        if (fornitore == null){
            return null;
            //TODO throw an exception
        }

        return FornitoreDto.builder()
                .id(fornitore.getId())
                .firstname(fornitore.getFirstname())
                .lastname(fornitore.getLastname())
                .adress(fornitore.getAdress())
                .photo(fornitore.getPhoto())
                .mail(fornitore.getMail())
                .tel(fornitore.getTel())
                .build();
    }
    public static Fornitore toEntity(FornitoreDto fornitoreDto){
        if (fornitoreDto == null){
            return null;
            //TODO throw an exception
        }
        Fornitore fornitore = new Fornitore();
        fornitore.setId(fornitoreDto.getId());
        fornitore.setFirstname(fornitoreDto.getFirstname());
        fornitore.setLastname(fornitoreDto.getLastname());
        fornitore.setAdress(fornitoreDto.getAdress());
        fornitore.setPhoto(fornitoreDto.getPhoto());
        fornitore.setMail(fornitoreDto.getMail());
        fornitore.setTel(fornitoreDto.getTel());
        return fornitore;
    }
}
