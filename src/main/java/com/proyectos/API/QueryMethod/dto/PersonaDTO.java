package com.proyectos.API.QueryMethod.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonaDTO {
    private Long id;
    private String ubication;
    private String position;
    private String fullName;
    private String image;
}
