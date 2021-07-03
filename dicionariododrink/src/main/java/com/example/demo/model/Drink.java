package com.example.demo.model;

import com.example.demo.Enum.Ingrediente;

import javax.persistence.*;


@Entity
@Table(name="drink")
public class Drink {

    private long id;
    private String name;
    private Ingrediente ingrediente1;
    private Ingrediente ingrediente2;
    private Ingrediente ingrediente3;
    private Ingrediente ingrediente4;
    private Ingrediente ingrediente5;
    private String origem;
    private Boolean alcool;
    private int doce;
    private int citrico;
    private int refrescante;


    public Drink(){

    }

    public Drink (long id, String name, Ingrediente ingrediente1,Ingrediente ingrediente2, Ingrediente ingrediente3, Ingrediente ingrediente4, Ingrediente ingrediente5, String origem, Boolean alcool, int doce, int citrico, int refrescante){
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

    @Column(name="name" , nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    @Column(name= "ingrediente1", nullable = false)
    public Ingrediente getIngrediente1() {
        return ingrediente1;
    }
    public void setIngrediente1() {
        this.ingrediente1=ingrediente1;
    }

    @Column(name= "Ingrediente2", nullable = false)
    public Ingrediente getIngrediente2() {
        return ingrediente2;
    }
    public void setIngrediente2() {
        this.ingrediente2=ingrediente2;
    }

    @Column(name= "Ingrediente3", nullable = true)
    public Ingrediente getIngrediente3() {
        return ingrediente3;
    }
    public void setIngrediente3() {
        this.ingrediente3=ingrediente3;
    }

    @Column(name= "Ingrediente4", nullable = true)
    public Ingrediente getIngrediente4() {
        return ingrediente4;
    }
    public void setIngrediente4() {
        this.ingrediente4=ingrediente4;
    }

    @Column(name= "Ingrediente5", nullable = true)
    public Ingrediente getIngrediente5() {
        return ingrediente5;
    }
    public void setIngrediente5() {
        this.ingrediente5=ingrediente5;
    }
    @Column(name= "origem", nullable = true)
    public String getOrigem() {
        return origem;
    }
    public void setOrigem() {
        this.origem=origem;
    }

    @Column(name="alcool", nullable = false)
    public Boolean getAlcool() {
        return alcool;
    }
    public void setAlcool() {
        this.alcool=alcool;
    }

    @Column(name="doce", nullable= false)
    public int getDoce() {
        return doce;
    }
    public void setDoce() {
        this.doce=doce;
    }

    @Column(name="citrico", nullable = false)
    public int getCitrico() {
        return citrico;
    }
    public void setCitrico() {
        this.citrico=citrico;
    }

    @Column(name="refrescante", nullable = false)
    public int getRefrescante() {
        return refrescante;
    }
    public void setRefrescante() {
        this.refrescante=refrescante;
    }

    public String ToString(){
        return "Drink [id="+id+",name="+name+",ingrediente1="+ingrediente1+",ingrediente2="+ingrediente2+",ingrediente3="+ingrediente3+",ingrediente4="+ingrediente4+",ingrediente5="+ingrediente5+",origem="+origem+",alcool="+alcool+",doce="+doce+",citrico="+citrico+",refrescante="+refrescante+"]";
    }

}
