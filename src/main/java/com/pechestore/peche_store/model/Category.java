package com.pechestore.peche_store.model;

import java.util.List;

import com.pechestore.peche_store.model.enums.Categories;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING) // This ensures the role is saved as a string in the database
    private Categories name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
