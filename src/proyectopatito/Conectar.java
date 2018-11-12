
package proyectopatito;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conectar {
    Connection conectar = null;
    public Connection conexion(){
    try{
    conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cablenetpatito", "root", "");
    //JOptionPane.showMessageDialog(null, "Conectado a la Base de Datos de Patito");        
    }catch (SQLException e){
       System.out.println(e.getMessage());
    }   
    return conectar;
    }
}
