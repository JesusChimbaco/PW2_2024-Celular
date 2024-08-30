package co.edu.uceva.demo20242.controller;


import co.edu.uceva.demo20242.model.entities.Celular;
import co.edu.uceva.demo20242.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/celular-service")
public class CelularRestController {

    @Autowired
    private CelularServiceImpl celularService;

    @GetMapping("/celulares")
    public List<Celular> listar(){
        return this.celularService.listar();
    }

}
