package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Adress;
import com.adias.gestionestock.model.entities.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.List;
@Data
@Builder
public class UserDto {
    private Integer id;
    private String firstname;
    private String mail;
    private Instant dateOfBurn;
    private String password;
    private Adress adress;
    private String photo;
    private AziendaDto azienda;
    @JsonIgnore
    private List<RoleDto> roles;
    public static UserDto fromEntity(User user){
        if (user == null){
            return null;
            //TODO throw an exception
        }

        return UserDto.builder()
                .id(user.getId())
                .firstname(user.getFirstname())
                .adress(user.getAdress())
                .photo(user.getPhoto())
                .mail(user.getMail())
                .azienda(AziendaDto.fromEntity(user.getAzienda()))
                .build();
    }
    public static User toEntity(UserDto userDto){
        if (userDto == null){
            return null;
            //TODO throw an exception
        }
        User user = new User();
        user.setId(userDto.getId());
        user.setFirstname(userDto.getFirstname());
        user.setMail(userDto.getMail());
        user.setAdress(userDto.getAdress());
        user.setPhoto(userDto.getPhoto());
        user.setAzienda(AziendaDto.toEntity(userDto.getAzienda()));
        return user;
    }
}
