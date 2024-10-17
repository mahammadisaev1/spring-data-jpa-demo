package com.demo.springdatajpademo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Mission {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int duration;

    @ManyToMany(mappedBy = "missions")
    private List<Employee> employees;
}
