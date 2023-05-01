package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Adress;
import com.adias.gestionestock.model.entities.Article;
import com.adias.gestionestock.model.entities.Azienda;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class AziendaDto {
    private Integer id;
    private String name;
    private String description;
    private Adress adress;
    private String fiscalCod;
    private String photo;
    private String mail;
    private String tel;
    public static AziendaDto fromEntity(Azienda azienda){
        if (azienda == null){
            return null;
            //TODO throw an exception
        }

        return AziendaDto.builder()
                .id(azienda.getId())
                .name(azienda.getName())
                .description(azienda.getDescription())
                .adress(azienda.getAdress())
                .photo(azienda.getPhoto())
                .mail(azienda.getMail())
                .tel(azienda.getTel())
                .build();
    }
    public static Azienda toEntity(AziendaDto aziendaDto){
        if (aziendaDto == null){
            return null;
            //TODO throw an exception
        }
        Azienda azienda = new Azienda();
        azienda.setId(aziendaDto.getId());
        azienda.setName(aziendaDto.getName());
        azienda.setDescription(aziendaDto.getDescription());
        azienda.setAdress(aziendaDto.getAdress());
        azienda.setPhoto(aziendaDto.getPhoto());
        azienda.setMail(aziendaDto.getMail());
        azienda.setTel(aziendaDto.getTel());
        return azienda;
    }
}
