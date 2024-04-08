import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;
    public String getNombre() {
        return nombre;
    }
    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void addCorrelativa(Materia correlativa){
        this.correlativas.add(correlativa);
    }
    public Materia(String nombre) {
        super();
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();

    }
}
