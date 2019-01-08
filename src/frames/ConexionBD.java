package frames;

import java.sql.*;


public class ConexionBD {

    Connection cn;

    public Connection conexion() {

        try {
            //La siguiente instrucción en la versión de Java que estoy usando no
            //es necesaria. Pero no está de más repasarla por si se trabajara
            //alguna vez con una versión más antigua:

            //Class.forName("com.mysql.jdbc.Driver");

            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema", "root", "");

            System.out.println("Hecha conexión con éxito.");
            
        } catch (SQLException e) {
            
            System.out.println("Conexión fallido por " + e.getMessage());
        }
        return cn;

    }
    
    Statement createStatement(){
        //throw se usa para lanzar explicitamente una excepción.
        throw new UnsupportedOperationException("No soportado.");
    }

}
