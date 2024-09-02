package co.edu.uceva.demo20242.model.service;

import co.edu.uceva.demo20242.model.entities.Celular;

import java.util.List;

public interface ICelularService {
    List<Celular> listar(); // Metodo que lista celular.
    void delete(Celular celular); // Metodo que elimina delular por ID.
    Celular save(Celular celular); // Metodo que guarda ceular.
    Celular findById(Long id); // Metodo que busca celular por ID.
    Celular update(Celular celular); // Metodo que actualiza.

}
