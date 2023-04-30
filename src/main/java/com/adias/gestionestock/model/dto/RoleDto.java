package com.adias.gestionestock.model.dto;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class RoleDto {
    private Integer id;
    private String roleName;
    private UserDto user;
}
