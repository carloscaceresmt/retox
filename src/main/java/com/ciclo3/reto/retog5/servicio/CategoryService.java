package com.ciclo3.reto.retog5.servicio;


import com.ciclo3.reto.retog5.entidad.Category;
import com.ciclo3.reto.retog5.entidad.Client;
import com.ciclo3.reto.retog5.repositorio.CategoryRepository;
import com.ciclo3.reto.retog5.repositorio.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    /**
     * peticion get
     */
    public List<Category> getCategory(){
        return repository.findAll();
    }

    /**
     * peticion post
     */
    public Category saveCategory(Category category){
        return repository.save(category);
    }

}
