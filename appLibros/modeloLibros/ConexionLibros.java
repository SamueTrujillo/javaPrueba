package modeloLibros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Modelo.Conexion;

public class ConexionLibros {

	private final String base = "biblioteca";
	private final String user = "root";
	private final String password = "";
	private final String url = "jdbc:mysql://localhost:3306/" + base;
	private Connection con = null;
	
	public Connection getConexion()
	{
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(url, user, password);
		
	} catch(SQLException e)
	{
		System.err.println(e);
	} catch(ClassNotFoundException ex) {
		Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
	}
		return con;
		
	}
	
}
