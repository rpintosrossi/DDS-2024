package main.java.domain;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    String nombre;
    int codigoMateria;
    List<Materia> materiasCorrelativas = new ArrayList<>();



    public Materia(String nombre, int codigoMateria,List<Materia> materiasCorrelativas){
        this.nombre = nombre;
        this.codigoMateria = codigoMateria;
        this.materiasCorrelativas = materiasCorrelativas;
    }


    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void setMateriasCorrelativas(List<Materia> materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }


}
