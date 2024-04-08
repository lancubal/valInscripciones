import java.util.List;

public class Inscripcion {
    private final Alumno alum;
    private final List<Materia> materias;

    public Inscripcion(Alumno alum,List<Materia> materias) {
        this.alum = alum;
        this.materias = materias;
    }

    public  boolean aprobada() {

        boolean ret = true;
        List<Materia> aprobadas = alum.getMateriasAprobadas();

        for (int i = 0; i< materias.size() ; i++) {
            Materia m = materias.get(i);

            if (!validarCorrelativas(m,aprobadas)) {
                System.out.println("El alumno no cumple la correlativa " + m.getNombre());
                ret = false;
            }

        }

        if (ret)
            System.out.println("La inscripcion esta aprobada para el alumno " + alum.getNombre());

        return ret;

    }

    public boolean validarCorrelativas(Materia mat, List<Materia> aprobadas) {

        boolean ret = true;
        List<Materia> correlativas = mat.getCorrelativas();

        for (int i = 0; i<correlativas.size(); i++) {
            Materia correlativa = correlativas.get(i);

            if(!aprobadas.contains(correlativa)) {
                System.out.println("El alumno no aprobo " + correlativa.getNombre());
                ret = false;
            }
        }

        if(ret)
            System.out.println("El alumno cumple las correlativas para " + mat.getNombre());

        return ret;
    }

    public static void main(String[] ar) {

    }
}
