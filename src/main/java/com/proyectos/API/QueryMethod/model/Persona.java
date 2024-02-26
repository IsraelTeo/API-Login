package com.proyectos.API.QueryMethod.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Basic
    private String ubication;
    private String position;
    private String fullName;
    private String image;
    //Omitimos usar @JsonIgnore para forzarnos a
    // usar un DTO y que la response no muestre el usuario ni la contraseña
    private String user;
    //Omitimos usar @JsonIgnore para forzarnos a
    // usar un DTO y que la response no muestre el usuario ni la contraseña
    private String password;



}
