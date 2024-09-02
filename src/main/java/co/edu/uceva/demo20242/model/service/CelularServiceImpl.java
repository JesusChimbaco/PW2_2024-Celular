package co.edu.uceva.demo20242.model.service;

import co.edu.uceva.demo20242.model.dao.CelularDao;
import co.edu.uceva.demo20242.model.entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CelularServiceImpl implements ICelularService {

    @Autowired
    CelularDao celularDao;


    //Metodo que lista los celulares.
    @Override
    public List<Celular> listar() {
        return (List<Celular>) celularDao.findAll();
    }

    //Metodo que elimina celular por ID.
    @Override
    public void delete(Celular celular) {
        celularDao.delete(celular);
    }

    //Metodo que guarda celular.
    @Override
    public Celular save(Celular celular) {
        return celularDao.save(celular);
    }

    //Metodo que busca pais por ID.
    @Override
    public Celular findById(Long id) {
        return celularDao.findById(id).orElse(null);
    }

    //Metodo que actualiza celular.
    @Override
    public Celular update(Celular celular) {
        return celularDao.save(celular);
    }

}




