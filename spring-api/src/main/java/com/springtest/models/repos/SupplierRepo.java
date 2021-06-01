package com.springtest.models.repos;

import java.util.List;

import com.springtest.models.entities.Supplier;

import org.springframework.data.repository.CrudRepository;

public interface SupplierRepo extends CrudRepository<Supplier, Long> {
    
    //source https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference

   //JPA query
   Supplier findByEmail(String email);

   //Query Lookup Strategy
   List<Supplier> findByNameContains(String name);


   //mencari data yang diawali dengan kata
   List<Supplier> findByNameStartsWith(String name);

   //mencari data yang diakhiri dengan kata
   List<Supplier> findByNameEndsWith(String name);

   //mencari salah satu yang benar karna menggunakan OR
   List<Supplier> findByNameContainsOrEmailContains(String name, String email);
}
