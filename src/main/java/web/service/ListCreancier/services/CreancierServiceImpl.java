package web.service.ListCreancier.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.service.ListCreancier.entities.Creancier;
import web.service.ListCreancier.repositories.CreancierRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class CreancierServiceImpl implements CreancierService {

    @Autowired
    CreancierRepository cRepository;


    @Override
    public List<Creancier> getCreanciers() {

        return cRepository.findAll();



    }
}
