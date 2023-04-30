package com.adias.gestionestock.model.dto;
import lombok.Builder;
import lombok.Data;
@Data
public class RoleDto {
    private Integer id;
    private String roleName;
    private UserDto user;
}
