package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Adress;
import com.adias.gestionestock.model.entities.Azienda;
import com.adias.gestionestock.model.entities.Client;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import java.util.List;
@Data
@Builder
public class ClientDto {
    private Integer id;
    private String firstname;
    private String lastname;
    private Adress adress;
    private String photo;
    private String mail;
    private String tel;
    @JsonIgnore
    private List<ComandClientDto> comandClients;
    public static ClientDto fromEntity(Client client){
        if (client == null){
            return null;
            //TODO throw an exception
        }

        return ClientDto.builder()
                .id(client.getId())
                .firstname(client.getFirstname())
                .lastname(client.getLastname())
                .adress(client.getAdress())
                .photo(client.getPhoto())
                .mail(client.getMail())
                .tel(client.getTel())
                .build();
    }
    public static Client toEntity(ClientDto clientDto){
        if (clientDto == null){
            return null;
            //TODO throw an exception
        }
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setFirstname(clientDto.getFirstname());
        client.setLastname(clientDto.getLastname());
        client.setAdress(clientDto.getAdress());
        client.setPhoto(clientDto.getPhoto());
        client.setMail(clientDto.getMail());
        client.setTel(clientDto.getTel());
        return client;
    }
}
