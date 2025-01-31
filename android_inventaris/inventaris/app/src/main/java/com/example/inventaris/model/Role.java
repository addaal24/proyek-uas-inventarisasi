package com.example.inventaris.model;

public class Role {
    private Integer id;
    private com.example.inventaris.model.ERole name;

    public Role() {
        // Constructor kosong diperlukan untuk penggunaan ORM (misalnya, Hibernate)
    }

    public Role(Integer id, com.example.inventaris.model.ERole name) {
        this.id = id;
        this.name = name;
    }

    // Getter dan Setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public com.example.inventaris.model.ERole getName() {
        return name;
    }

    public void setName(com.example.inventaris.model.ERole name) {
        this.name = name;
    }
}
