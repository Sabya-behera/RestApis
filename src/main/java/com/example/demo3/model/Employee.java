package com.example.demo3.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "restapi")
public class Employee implements Serializable

{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SALARY")
    private float sal;


    public Employee()
    {}

    public Employee(int id, String name, float sal)
    {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSal() {
        return sal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
}