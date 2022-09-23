package com.ciclo3.reto.retog5.repositorio;


import com.ciclo3.reto.retog5.entidad.Category;
import com.ciclo3.reto.retog5.entidad.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
