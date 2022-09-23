package com.ciclo3.reto.retog5.servicio;


import com.ciclo3.reto.retog5.entidad.Room;
import com.ciclo3.reto.retog5.repositorio.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository repository;

    /**
     * peticion get
     */
    public List<Room> getRoom(){
        return repository.findAll();
    }

    /**
     * peticion post
     */
    public Room saveRoom(Room room){
        return repository.save(room);
    }

}
