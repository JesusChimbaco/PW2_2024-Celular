package co.edu.uceva.demo20242.model.service;

import co.edu.uceva.demo20242.model.dao.CelularDao;
import co.edu.uceva.demo20242.model.entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CelularServiceImpl implements ICelularService{

    @Autowired
    CelularDao celularDao;


    //Metodo que lista los celulares y retorna la lista.
    @Override
    public List<Celular> listar(){
        return (List<Celular>) celularDao.findAll();
    }
}
