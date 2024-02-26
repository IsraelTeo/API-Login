package com.proyectos.API.QueryMethod.service;

import com.proyectos.API.QueryMethod.dto.PersonaDTO;
import com.proyectos.API.QueryMethod.model.Persona;

import java.util.List;

public interface IPersonaService {

    public Persona get(Long id);

    public List<Persona> getAll();

    public void created(Persona persona);

    public void edit(Persona persona);

    public void delete(Long id);

    //login
    public PersonaDTO login (String user, String password);
}
