package com.proyectos.API.QueryMethod.controller;

import com.proyectos.API.QueryMethod.dto.PersonaDTO;
import com.proyectos.API.QueryMethod.model.Persona;
import com.proyectos.API.QueryMethod.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaService persoServ;

    @GetMapping("/traer/{id}")
    @ResponseBody
    public Persona get(@PathVariable Long id){
        return persoServ.get(id);
    }

    @GetMapping("/traer/todos")
    @ResponseBody
    public List<Persona> getAll(){
        return persoServ.getAll();
    }

    @PostMapping("/crear")
    public ResponseEntity<String> created(@RequestBody Persona persona){
         persoServ.created(persona);
        return new ResponseEntity<>("La persona fue creada con exito.", HttpStatus.CREATED);
    }

    @PutMapping("/modificar")
    public ResponseEntity<String> edit(@RequestBody Persona persona){
        persoServ.edit(persona);
        return new ResponseEntity<>("Los datos de la persona fue editada con exito.", HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        persoServ.delete(id);
        return new ResponseEntity<>("La persona fue eliminada con exito.",HttpStatus.OK);
    }

    @PostMapping("/login")
    public PersonaDTO login (@RequestBody Persona persona){
        return persoServ.login(persona.getUser(), persona.getPassword());
    }


}
