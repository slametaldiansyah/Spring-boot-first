package com.springtest.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tbl_product")
public class Product implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id //PrimaryKey
    @GeneratedValue(strategy = GenerationType.IDENTITY) //for autoincrement
    private long id;
    
    // @Column(name = "product_name", length = 100)
    @NotEmpty(message = "Name is Required")
    @Column(length = 100)
    private String name;
    
    @NotEmpty(message = "Description is Required")
    @Column(length = 500)
    private String description;
    
    private Double price;

    public Product() {
    }

    public Product(long id, String name, String description, Double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

        

}
