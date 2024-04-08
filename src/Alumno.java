import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private final String nombre;
    private final int legajo;
    private final List<Materia> materiasAprobadas;

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void aprobarMateria(Materia m) {
        materiasAprobadas.add(m);
    }

    public Alumno(String nombre, int legajo) {
        super();
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<Materia> ();
    }

}
