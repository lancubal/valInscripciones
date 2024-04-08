import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    void inscribirseAyED(){

        Alumno alumno = new Alumno("Agustin",1765516);

        Materia discreta = new Materia("Matematica discreta");
        Materia algoritmos = new Materia("Algoritmos y estructuras de datos");

        alumno.aprobarMateria(discreta);

        List<Materia> materiasAAnotarse = new ArrayList<>();
        materiasAAnotarse.add(algoritmos);
        Inscripcion inscripcion = new Inscripcion(alumno,materiasAAnotarse);
        assertTrue(inscripcion.aprobada());
    }

    @Test
    void inscribirseAPdePSin(){

        Alumno alumno = new Alumno("Agustin",1765516);

        Materia discreta = new Materia("Matematica discreta");
        Materia algoritmos = new Materia("Algoritmos y estructuras de datos");

        Materia pdep = new Materia("Paradigmas de programacion");
        pdep.addCorrelativa(discreta);
        pdep.addCorrelativa(algoritmos);

        alumno.aprobarMateria(discreta);

        List<Materia> materiasAAnotarse = new ArrayList<>();
        materiasAAnotarse.add(pdep);
        Inscripcion inscripcion = new Inscripcion(alumno,materiasAAnotarse);

        assertFalse(inscripcion.aprobada());

    }
    @Test
    void inscribirseAPdePCon(){

        Alumno alumno = new Alumno("Agustin",1765516);

        Materia discreta = new Materia("Matematica discreta");
        Materia algoritmos = new Materia("Algoritmos y estructuras de datos");

        Materia pdep = new Materia("Paradigmas de programacion");
        pdep.addCorrelativa(discreta);
        pdep.addCorrelativa(algoritmos);

        alumno.aprobarMateria(discreta);
        alumno.aprobarMateria(algoritmos);

        List<Materia> materiasAAnotarse = new ArrayList<>();
        materiasAAnotarse.add(pdep);
        Inscripcion inscripcion = new Inscripcion(alumno,materiasAAnotarse);

        assertTrue(inscripcion.aprobada());

    }

    @Test
    void anotarseASegundoSin(){

        Alumno alumno = new Alumno("Agustin",1765516);

        //primero
        Materia discreta = new Materia("Matematica discreta");
        Materia ami = new Materia("Analisis Matematico 1");
        Materia algebra = new Materia("Algebra y geometria analitica");
        Materia algoritmos = new Materia("Algoritmos y estructuras de datos");
        Materia arquitectura = new Materia("Arquitectura de computadoras");
        Materia syo = new Materia("Sistemas y organizaciones");
        Materia iys = new Materia("Ingenieria y sociedad");
        Materia quimica = new Materia("Quimica");

        //segundo
        Materia ads = new Materia("Analisis de Sistemas");
        ads.addCorrelativa(syo);
        ads.addCorrelativa(algoritmos);
        Materia amii = new Materia("Analisis matematico 2");
        amii.addCorrelativa(ami);
        Materia ssl = new Materia("Sintaxis y semantica de los lenguajes");
        ssl.addCorrelativa(discreta);
        ssl.addCorrelativa(algoritmos);
        Materia fisicai = new Materia("Fisica 1");
        Materia pdep = new Materia("Paradigmas de programacion");
        pdep.addCorrelativa(discreta);
        pdep.addCorrelativa(algoritmos);
        Materia inglesi = new Materia("Ingles 1");
        Materia proba = new Materia("Probabilidad y estadistica");
        proba.addCorrelativa(algebra);
        proba.addCorrelativa(ami);

        alumno.aprobarMateria(discreta);
        alumno.aprobarMateria(algoritmos);

        List<Materia> materiasAAnotarse = new ArrayList<>();
        materiasAAnotarse.add(pdep);
        materiasAAnotarse.add(ads);
        materiasAAnotarse.add(amii);
        materiasAAnotarse.add(ssl);
        materiasAAnotarse.add(fisicai);
        materiasAAnotarse.add(pdep);
        materiasAAnotarse.add(inglesi);
        materiasAAnotarse.add(proba);
        Inscripcion inscripcion = new Inscripcion(alumno,materiasAAnotarse);

        assertFalse(inscripcion.aprobada());

    }

    @Test
    void anotarseASegundoCon(){

        Alumno alumno = new Alumno("Agustin",1765516);

        //primero
        Materia discreta = new Materia("Matematica discreta");
        Materia ami = new Materia("Analisis Matematico 1");
        Materia algebra = new Materia("Algebra y geometria analitica");
        Materia algoritmos = new Materia("Algoritmos y estructuras de datos");
        Materia arquitectura = new Materia("Arquitectura de computadoras");
        Materia syo = new Materia("Sistemas y organizaciones");
        Materia iys = new Materia("Ingenieria y sociedad");
        Materia quimica = new Materia("Quimica");

        //segundo
        Materia ads = new Materia("Analisis de Sistemas");
        ads.addCorrelativa(syo);
        ads.addCorrelativa(algoritmos);
        Materia amii = new Materia("Analisis matematico 2");
        amii.addCorrelativa(ami);
        Materia ssl = new Materia("Sintaxis y semantica de los lenguajes");
        ssl.addCorrelativa(discreta);
        ssl.addCorrelativa(algoritmos);
        Materia fisicai = new Materia("Fisica 1");
        Materia pdep = new Materia("Paradigmas de programacion");
        pdep.addCorrelativa(discreta);
        pdep.addCorrelativa(algoritmos);
        Materia inglesi = new Materia("Ingles 1");
        Materia proba = new Materia("Probabilidad y estadistica");
        proba.addCorrelativa(algebra);
        proba.addCorrelativa(ami);

        alumno.aprobarMateria(discreta);
        alumno.aprobarMateria(algoritmos);
        alumno.aprobarMateria(ami);
        alumno.aprobarMateria(algebra);
        alumno.aprobarMateria(arquitectura);
        alumno.aprobarMateria(syo);
        alumno.aprobarMateria(iys);
        alumno.aprobarMateria(quimica);

        List<Materia> materiasAAnotarse = new ArrayList<>();
        materiasAAnotarse.add(pdep);
        materiasAAnotarse.add(ads);
        materiasAAnotarse.add(amii);
        materiasAAnotarse.add(ssl);
        materiasAAnotarse.add(fisicai);
        materiasAAnotarse.add(pdep);
        materiasAAnotarse.add(inglesi);
        materiasAAnotarse.add(proba);
        Inscripcion inscripcion = new Inscripcion(alumno,materiasAAnotarse);

        assertTrue(inscripcion.aprobada());
    }

}