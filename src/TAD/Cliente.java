/////////////////////////////////////////
// Estudiante: Elizabeth Montes de Oca
// Asignatura: Lenguaje de Programación de la Web I
// Profesor: Julio Castillo
/////////////////////////////////////////

package TAD;

public class Cliente {
    private int id;
    private String email;
    private String nombre;
    private String apellido;
    private String fechaAlta;
    private String ultimoAcceso;

    public Cliente(int id, String email, String nombre, String apellido, String fechaAlta, String ultimoAcceso){
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaAlta = fechaAlta;
        this.ultimoAcceso = ultimoAcceso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellidos) {
        this.apellido = Apellidos;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getUltimoAcceso() {
        return ultimoAcceso;
    }

    public void setUltimoAcceso(String ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }    
}
