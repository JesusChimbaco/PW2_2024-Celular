package co.edu.uceva.demo20242.controller;


import co.edu.uceva.demo20242.model.entities.Celular;
import co.edu.uceva.demo20242.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/celular-service")
public class CelularRestController {

    @Autowired
    private CelularServiceImpl celularService;

    @GetMapping("/celulares")
    public List<Celular> listar(){ // Metodo que lista celular.
        return this.celularService.listar();
    }

    @GetMapping("/celulares/{id}")
    public Celular buscaCelular(@PathVariable long id){ //Metodo que busca celular por id.
        return this.celularService.findById(id);
    }

    @PostMapping("/celular")
    public Celular guardarCelular(@RequestBody Celular celular){ //Metodo que guarda celular.
        return this.celularService.save(celular);
    }

    @PutMapping("celular")
    public Celular actualizarCelular(@RequestBody Celular celular){ //Metodo que actualiza celular.
        return this.celularService.save(celular);
    }

    @DeleteMapping("/celular/{id}")
    public void eliminarCelular(@PathVariable long id){
        Celular celular = this.celularService.findById(id); //Encuantra el celular por id.
        this.celularService.delete(celular); //Lo elimina.
    }

}
