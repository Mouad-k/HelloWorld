package com.project.HelloWorld.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HelloEntity {

    @Id
    private Long id;

    private String message;

    public HelloEntity() {
    }

    public HelloEntity(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
