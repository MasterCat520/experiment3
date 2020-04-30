package edu.example.petclinic.model;

import org.springframework.data.annotation.Id;

public class BaseEntity {
    @Id
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
