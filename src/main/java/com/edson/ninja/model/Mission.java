package com.edson.ninja.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "mission")
@Data
public class Mission {
    private Long id;
    private String name;
    private String rank;

    @OneToMany(mappedBy = "ninja")
    private List<Ninja> ninjas;

}
