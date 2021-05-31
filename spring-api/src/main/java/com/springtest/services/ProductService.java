package com.springtest.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.springtest.models.entities.Product;
import com.springtest.models.entities.Supplier;
import com.springtest.models.repos.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    //create or update
    public Product save(Product product){
        return productRepo.save(product);
    }

    //cari berdasarkan id
    public Product findOne(Long id){
        Optional<Product> product = productRepo.findById(id);
        if (!product.isPresent()) {
            return null;
        }
        return product.get();
    }

    //cari semua
    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    //hapus semua
    public void removeOne(Long id){
        productRepo.deleteById(id);
    }

    public List<Product> findByName(String name){
        return productRepo.findByNameContains(name);
    }

    public void addSupplier(Supplier Supplier, Long productId){
        Product product = findOne(productId);
        
        if (product == null) {
            throw new RuntimeException("Product with ID: "+productId+" Not Found");
        }
        product.getSuppliers().add(Supplier);
        save(product);
    }
}
