package com.proyectos.API.QueryMethod.service;

import com.proyectos.API.QueryMethod.dto.PersonaDTO;
import com.proyectos.API.QueryMethod.model.Persona;
import com.proyectos.API.QueryMethod.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private IPersonaRepository persoRepo;

    @Override
    public Persona get(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Persona> getAll() {
        return persoRepo.findAll();
    }

    @Override
    public void created(Persona persona) {
        persoRepo.save(persona);
    }

    @Override
    public void edit(Persona persona) {
        persoRepo.save(persona);
    }

    @Override
    public void delete(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public PersonaDTO login(String user, String password) {

        Persona persona = persoRepo.findByUserAndPassword( user,  password);
        PersonaDTO personaDTO = new PersonaDTO(persona.getId(),persona.getUbication(), persona.getPosition(), persona.getFullName(), persona.getImage());
        return personaDTO;
    }
}
