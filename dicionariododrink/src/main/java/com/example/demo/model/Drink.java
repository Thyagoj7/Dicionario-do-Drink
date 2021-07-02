package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="drink")
public class Drink {

    private long id;
    private String name;
    private String ingrediente1;
    private String ingrediente2;
    private String ingrediente3;
    private String ingrediente4;
    private String ingrediente5;
    private String origem;
    private Boolean alcool;
    private Boolean doce;
    private Boolean citrico;
    private Boolean refrescante;


    public Drink(){

    }

    public Drink (long id, String name, String ingrediente1,String ingrediente2, String ingrediente3, String ingrediente4, String ingrediente5, String origem, Boolean alcool, Boolean doce, Boolean citrico, Boolean refrescante){
        this.id=id;
        this.name=name;
        this.ingrediente1=ingrediente1;
        this.ingrediente2=ingrediente2;
        this.ingrediente3=ingrediente3;
        this.ingrediente4=ingrediente4;
        this.ingrediente5=ingrediente5;
        this.origem=origem;
        this.alcool=alcool;
        this.doce=doce;
        this.citrico=citrico;
        this.refrescante=refrescante;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}
