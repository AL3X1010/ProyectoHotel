package database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBA {
    public Connection conexion = null;
    public Statement query = null;
    
    public DBA( String nombreServidor, String nombreBD, String usuario,
            String contrasenia ) throws ClassNotFoundException, SQLException{
        establecerConexion( nombreServidor, nombreBD, usuario, contrasenia );
    } // Fin del método constructor.

    DBA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void establecerConexion( String nombreServidor, String nombreBD,
            String usuario, String contrasenia ) throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String URL = "jdbc:sqlserver://" + nombreServidor + ":1433;" +
                "databaseName=" + nombreBD + ";user=" + usuario + ";" +
                "password=" + contrasenia;
        
        conexion = DriverManager.getConnection( URL );
    } // Fin del método establecerConexion().
    
    public void conectar() throws SQLException{
        query = conexion.createStatement();
    } // Fin del método conectar().
    
    public void desconectar() throws SQLException{
        query.close();
        conexion.close();
    } // Fin del método desconectar().
    
    public void commit() throws SQLException{
        conexion.commit();
    } // Fin del método commit().
}
