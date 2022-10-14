package com.ciclo3.reto.retog5.controlador;

import com.ciclo3.reto.retog5.entidad.CountRoom;
import com.ciclo3.reto.retog5.entidad.Message;
import com.ciclo3.reto.retog5.entidad.Reservation;
import com.ciclo3.reto.retog5.servicio.MessageService;
import com.ciclo3.reto.retog5.servicio.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/Reservation/")
@CrossOrigin(origins = "*")
public class ApiReservation {
    @Autowired
    private ReservationService service;

    @GetMapping("/all")
    public List<Reservation> findAllClients(){
        return service.getMessage();
    }

    @GetMapping("/contador")
    public List<CountRoom> findClients(){
        return service.listaCliente();
    }

    @GetMapping("/report-dates/{inicio}/{fin}")
    public List<Reservation> findReportDate(@PathVariable String inicio,@PathVariable String fin){
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        try {
            //return service.fechaDepartamento(inicio, fin);
            SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
            c1.setTime(in.parse(inicio));
            SimpleDateFormat fn = new SimpleDateFormat("yyyy-MM-dd");
            c2.setTime(fn.parse(fin));

        } catch (ParseException ex) {
            // Logger.getLogger(DepartamentoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return service.fechaReservation(c1,c2);
    }

    @PostMapping("/save")
    public ResponseEntity saveClient(@RequestBody Reservation reservation){
        service.saveMessage(reservation);
        return ResponseEntity.status(201).build();
    }
}
