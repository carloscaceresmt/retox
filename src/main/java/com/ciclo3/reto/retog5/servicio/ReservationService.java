package com.ciclo3.reto.retog5.servicio;


import com.ciclo3.reto.retog5.entidad.CountRoom;
import com.ciclo3.reto.retog5.entidad.Message;
import com.ciclo3.reto.retog5.entidad.Reservation;
import com.ciclo3.reto.retog5.entidad.Room;
import com.ciclo3.reto.retog5.repositorio.MessageRepository;
import com.ciclo3.reto.retog5.repositorio.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository repository;

    /**
     * peticion get
     */
    public List<Reservation> getMessage(){
        return repository.findAll();
    }

    /**
     * peticion post
     */
    public Reservation saveMessage(Reservation message){
        return repository.save(message);
    }

    public List<Reservation> fechaReservation(Calendar inicio, Calendar fin){
        return repository.fechaReservation(inicio,fin);
    }

    public List<CountRoom> listaCliente(){
        List<CountRoom> res=new ArrayList<>();
        List<Object[]> report = repository.countTotalReservationsByRoom();
        for(int i=0;i<report.size();i++){
            res.add(new CountRoom((Long)report.get(i)[1],(Room)report.get(i)[0]));
        }
        return res;
    }


}
