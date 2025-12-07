package com.edson.ninja.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ninjas")
@Data
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private int age;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private Mission mission;
}
