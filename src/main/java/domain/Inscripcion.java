package main.java.domain;





public class Inscripcion {



    public boolean aprobada(Alumno alumno, Materia materia){
        return materia.getMateriasCorrelativas().stream().allMatch(mat -> alumno.getMateriasAprobadas().contains(mat));

    }



}
