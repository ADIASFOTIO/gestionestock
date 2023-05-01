package com.adias.gestionestock.model.dto;
import com.adias.gestionestock.model.entities.Role;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class RoleDto {
    private Integer id;
    private String roleName;
    private UserDto user;
    public static RoleDto fromEntity(Role role){
        if (role == null){
            return null;
            //TODO throw an exception
        }

        return RoleDto.builder()
                .id(role.getId())
                .roleName(role.getRoleName())
                .user(UserDto.fromEntity(role.getUser()))
                .build();
    }
    public static Role toEntity(RoleDto roleDto){
        if (roleDto == null){
            return null;
            //TODO throw an exception
        }
        Role role = new Role();
        role.setId(roleDto.getId());
        role.setRoleName(roleDto.getRoleName());
        role.setUser(UserDto.toEntity(roleDto.getUser()));
        return role;
    }
}
