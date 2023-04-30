package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Adress;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.List;
@Builder
@Data
public class UserDto {
    private Integer id;
    private String firstname;
    private String mail;
    private Instant dateOfBurn;
    private String password;
    private Adress adress;
    private String photo;
    private AziendaDto azienda;
    private List<RoleDto> roles;
}
