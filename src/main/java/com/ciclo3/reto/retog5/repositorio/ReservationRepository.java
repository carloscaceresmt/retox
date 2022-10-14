package com.ciclo3.reto.retog5.repositorio;


import com.ciclo3.reto.retog5.entidad.Category;
import com.ciclo3.reto.retog5.entidad.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    @Query("SELECT d FROM Reservation d WHERE startDate BETWEEN ?1 AND ?2")
    List<Reservation> fechaReservation(Calendar inicio, Calendar fin);

    @Query("SELECT c.room, COUNT(c.room) from Reservation AS c group by c.room order by COUNT(c.room) DESC")
    public List<Object[]> countTotalReservationsByRoom();

}
