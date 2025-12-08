package com.edson.mission.model;

import com.edson.ninja.model.Ninja;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

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
