package com.springtest.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class SupplierData {
    
    private Long id;

    @NotEmpty(message = "Name Is Required")
    private String name;

    @NotEmpty(message = "Address Is Required")
    private String address;
    
    @NotEmpty(message = "Email Is Required")
    @Email(message = "Email Is Not Valid")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
