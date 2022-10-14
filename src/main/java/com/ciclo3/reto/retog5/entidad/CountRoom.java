package com.ciclo3.reto.retog5.entidad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountRoom {
    private Long total;
    private Room skate;
}
