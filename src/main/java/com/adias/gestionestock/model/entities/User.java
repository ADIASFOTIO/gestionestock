package com.adias.gestionestock.model.entities;
import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "user")
public class User extends AbstractEntity{
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "mail")
    private String mail;
    @Column(name = "dateOfBurn")
    private Instant dateOfBurn;
    @Column(name = "password")
    private String password;
    @Embedded
    private Adress adress;
    @Column(name = "photo")
    private String photo;
    @ManyToOne
    @JoinColumn(name = "id_azienda")
    private Azienda azienda;
    @OneToMany(mappedBy = "user")
    private List<Role> roles;

}
