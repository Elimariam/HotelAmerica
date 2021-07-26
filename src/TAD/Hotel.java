/////////////////////////////////////////
// Estudiante: Elizabeth Montes de Oca
// Asignatura: Lenguaje de Programación de la Web I
// Profesor: Julio Castillo
/////////////////////////////////////////

package TAD;

public class Hotel {
    private int id;
    private String nombre;

    public Hotel(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
    
    @Override
    public String toString() {
        return this.nombre;
    }    
}
