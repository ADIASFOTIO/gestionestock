package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Adress;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class AdressDto {
    private Integer id;
    private String adress1;
    private String adress2;
    private String city;
    private String cap;
    private String country;
    public static AdressDto fromEntity(Adress adress){
        if (adress == null){
            return null;
            //TODO throw an exception
        }
        return AdressDto.builder()
                .adress1(adress.getAdress1())
                .adress2(adress.getAdress2())
                .city(adress.getCity())
                .cap(adress.getCap())
                .country(adress.getCountry())
                .build();
    }
    public static Adress toEntity(AdressDto adressDto){
        if (adressDto == null){
            return null;
            //TODO throw an exception
        }
        Adress adress = new Adress();
        adress.setAdress1(adressDto.getAdress1());
        adress.setAdress2(adressDto.getAdress2());
        adress.setCity(adressDto.getCity());
        adress.setCap(adressDto.getCap());
        adress.setCountry(adressDto.getCountry());
        return adress;
    }
}
