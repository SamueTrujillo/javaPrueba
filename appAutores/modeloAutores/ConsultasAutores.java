package modeloAutores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ConsultasAutores extends ConexionAutores{
	
	public boolean registrar(Autor aut)
	{
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		
		String sql = "INSERT INTO autores (codigo_autor, nombres, nacionalidad, fecha_nacimiento)"
				+ "VALUES(?,?,?,?)";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, aut.getCodigo_autor());
		ps.setString(2, aut.getNombres());
		ps.setString(3, aut.getNacionalidad());
		ps.setString(4, aut.getFecha_nacimiento());
		ps.execute();	
		return true;
		
		} catch(SQLException e)
		{
			System.err.println(e);
			return false;
			
		} finally {
			try {
				con.close();
			}catch(SQLException e) {
				System.err.println(e);
			}
		}
				
				
		
	}
	
	public boolean modificar(Autor aut)
	{
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		
		String sql = "UPDATE autores SET codigo_autor=?, nombres=?, nacionalidad=?, fecha_nacimiento=? WHERE codigo_autor=?";
		
		try {
		
		ps = con.prepareStatement(sql);
		
		ps.setString(1, aut.getNombres());
		ps.setString(2, aut.getNacionalidad());
		ps.setString(3, aut.getFecha_nacimiento());
		ps.setInt(4, aut.getCodigo_autor());
		
		ps.execute();	
		return true;
		
		} catch(SQLException e)
		{
			System.err.println(e);
			return false;
			
		} finally {
			try {
				con.close();
			}catch(SQLException e) {
				System.err.println(e);
			}
		}
				
				
		
	}
	
	public boolean eliminar(Autor aut)
	{
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		
		String sql = "DELETE FROM autores WHERE codigo_autor=?";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, aut.getCodigo_autor());
		ps.execute();	
		return true;
		
		} catch(SQLException e)
		{
			System.err.println(e);
			return false;
			
		} finally {
			try {
				con.close();
			}catch(SQLException e) {
				System.err.println(e);
			}
		}
				
				
		
	}
	
	public boolean buscar(Autor aut)
	{
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConexion();
		
		
		String sql = "SELECT * FROM autores WHERE codigo_autor=?";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, aut.getCodigo_autor());
		rs = ps.executeQuery();
		
		if(rs.next())
		{
			
			
			aut.setCodigo_autor(rs.getInt("codigo_autor"));
			aut.setNombres(rs.getString("nombres"));
			aut.setNacionalidad(rs.getString("nacionalidad"));
			aut.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
			
			return true;
		}
		
		return false;
		
		} catch(SQLException e)
		{
			System.err.println(e);
			return false;
			
		} finally {
			try {
				con.close();
			}catch(SQLException e) {
				System.err.println(e);
			}
		}
				
				
		
	}

	
}
