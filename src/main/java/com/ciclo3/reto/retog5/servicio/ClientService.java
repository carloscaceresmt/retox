package com.ciclo3.reto.retog5.servicio;


import com.ciclo3.reto.retog5.entidad.Client;
import com.ciclo3.reto.retog5.repositorio.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    /**
     * peticion get
     */
    public List<Client> getClient(){
        return repository.findAll();
    }

    /**
     * peticion post
     */
    public Client saveClient(Client client){
        return repository.save(client);
    }

}
