/////////////////////////////////////////
// Estudiante: Elizabeth Montes de Oca
// Asignatura: Lenguaje de Programación de la Web I
// Profesor: Julio Castillo
/////////////////////////////////////////

package TAD;

public class Habitacion {
    private int id;
    private String nombre;
    private int capacidad;
    private float precio;

    public Habitacion(int id, String nombre, int capacidad, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.nombre+" - Capacidad: "+this.capacidad;
    }    
}
