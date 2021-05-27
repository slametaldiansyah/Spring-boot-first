package com.springtest.models.repos;

import java.util.List;

import com.springtest.models.entities.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long>{

    //costume findbyname
    List<Product> findByNameContains(String name);
}
