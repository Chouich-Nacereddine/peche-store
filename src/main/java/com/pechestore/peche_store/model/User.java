package com.pechestore.peche_store.model;

import com.pechestore.peche_store.model.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String userpassword;

    @Column(unique = true, nullable = false)
    private String email;

    @Enumerated(EnumType.STRING) // This ensures the role is saved as a string in the database
    private Role role;

    @OneToOne(mappedBy = "user")
    private Cart cart;

}
