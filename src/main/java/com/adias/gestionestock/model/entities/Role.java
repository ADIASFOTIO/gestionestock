package com.adias.gestionestock.model.entities;
import jakarta.persistence.*;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "role")
public class Role extends AbstractEntity{
    @Column(name = "roleName")
    private String roleName;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
