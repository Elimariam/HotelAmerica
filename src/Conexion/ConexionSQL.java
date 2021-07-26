/////////////////////////////////////////
// Estudiante: Elizabeth Montes de Oca
// Asignatura: Lenguaje de Programación de la Web I
// Profesor: Julio Castillo
/////////////////////////////////////////

package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionSQL {
    Connection conexion = null;
    
    public Connection getConexionSQL(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/hotel_america", "root", "");
            //JOptionPane.showMessageDialog(null, "Conexión a la BD.");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en conexión a la base de datos: "+e.getMessage());
        }
        return conexion;
    }    
}
