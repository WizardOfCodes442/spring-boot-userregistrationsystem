package com.example.UserSystem.entity;
import lombok.EqualsAndHashCode;

import jakarta.persistence.*;

@EqualsAndHashCode
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 60)
    private String name;

    // Explicit getter for id
    public long getId() {
        return id;
    }

    // Explicit setter for id
    public void setId(long id) {
        this.id = id;
    }

    // Explicit getter for name
    public String getName() {
        return name;
    }

    // Explicit setter for name
    public void setName(String name) {
        this.name = name;
    }
}
