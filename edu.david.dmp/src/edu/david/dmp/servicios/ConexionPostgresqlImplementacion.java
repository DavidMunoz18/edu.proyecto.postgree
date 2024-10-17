package edu.david.dmp.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionPostgresqlImplementacion implements ConexionPostgresqlInterfaz {

	@Override
	public Connection generaConexion() {
	    // Definir los parámetros de la conexión
	    String url = "jdbc:postgresql://localhost:5432/proyectoBd";
	    String usuario = "postgres";
	    String contraseña = "Altair006";

	    Connection conexion = null;

	    try {
	        // Cargar el driver JDBC de PostgreSQL
	        Class.forName("org.postgresql.Driver");

	        // Establecer la conexión a la base de datos
	        conexion = DriverManager.getConnection(url, usuario, contraseña);
	        System.out.println("Conexión establecida con éxito.");
	    } catch (ClassNotFoundException e) {
	        // Error si el driver de PostgreSQL no está disponible
	        System.out.println("Error: No se pudo cargar el controlador de PostgreSQL.");
	        e.printStackTrace();
	    } catch (SQLException e) {
	        // Manejo de errores SQL al establecer la conexión
	        System.out.println("Error al establecer la conexión: " + e.getMessage());
	        e.printStackTrace();
	    }

	    // Devolver la conexión establecida o null si falló
	    return conexion;
	}

	
	
}
