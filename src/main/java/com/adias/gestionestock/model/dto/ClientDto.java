package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Adress;
import lombok.Builder;
import lombok.Data;
import java.util.List;
@Data
public class ClientDto {
    private Integer id;
    private String firstname;
    private String lastname;
    private Adress adress;
    private String photo;
    private String mail;
    private String tel;
    private List<ComandClientDto> comandClients;
}
