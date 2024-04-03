package test;

import main.java.domain.Alumno;
import main.java.domain.Inscripcion;
import main.java.domain.Materia;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class inscripcionTest {
    Alumno rodrigo = new Alumno("Rodrigo", "Pintos", 144261);
    Materia algoritmos = new Materia("algoritmos y estructura De Datos", 1,new ArrayList<>());

    Materia paradigmas = new Materia("Paradigmas de la programación", 2,List.of(algoritmos));

    Inscripcion inscripcion = new Inscripcion();

    @Test
    public void testMateriaAprobada(){
        assertTrue(inscripcion.aprobada(rodrigo,algoritmos));
    }

    @Test
    public void testMateriaDesaprobada(){
        assertFalse(inscripcion.aprobada(rodrigo,paradigmas));
    }




}
