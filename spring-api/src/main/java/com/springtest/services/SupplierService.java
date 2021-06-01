package com.springtest.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.springtest.models.entities.Supplier;
import com.springtest.models.repos.SupplierRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SupplierService {
    
    @Autowired
    private SupplierRepo supplierRepo;

    public Supplier save(Supplier supplier){
        return supplierRepo.save(supplier);
    }

    public Supplier findOne(Long id){
        Optional<Supplier> supplier = supplierRepo.findById(id);
        if (!supplier.isPresent()) {
            return null;
        }
        return supplier.get();
    }

    public Iterable<Supplier> findAll(){
        return supplierRepo.findAll();
    }

    public void removeOne(Long id){
        supplierRepo.deleteById(id);
    }

    public Supplier findByEmail(String email){
        return supplierRepo.findByEmail(email);
    }

    public List<Supplier> findByNameContains(String name){
        return supplierRepo.findByNameContains(name);
    }

    public List<Supplier> findByNameStartsWith(String name){
        return supplierRepo.findByNameStartsWith(name);
    }

    public List<Supplier> findByNameEndsWith(String name){
        return supplierRepo.findByNameEndsWith(name);
    }

    public List<Supplier> findByNameContainsOrEmailContains(String name, String email){
        return supplierRepo.findByNameContainsOrEmailContains(name, email);
    }
}
