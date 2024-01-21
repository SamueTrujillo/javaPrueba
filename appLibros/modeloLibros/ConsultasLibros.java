package modeloLibros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ConsultasLibros extends ConexionLibros {

	public boolean registrar(Libro lib)
	{
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		
		String sql = "INSERT INTO libros (codigo_copia, numero_isbn, categoria, codigo_foraneo_autor, estado, nombre_libro)"
				+ "VALUES(?,?,?,?,?,?)";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, lib.getCodigo_copia());
		ps.setString(2, lib.getNumero_ISBN());
		ps.setString(3, lib.getCategoria());
		//ps.setString(4, lib.autor);
		ps.setBoolean(5, lib.isEstado());
		ps.setString(6, lib.getNombre_libro());
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
	
	public boolean modificar(Libro lib)
	{
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		
		String sql = "UPDATE libros SET codigo_copia=?, numero_isbn=?, categoria=?, codigo_foraneo_autor=?, estado=?, nombre_libro=? WHERE codigo_copia=?";
		
		try {
		
		ps = con.prepareStatement(sql);
		
		ps.setString(1, lib.getNumero_ISBN());
		ps.setString(2, lib.getCategoria());
		//ps.setString(3, lib.autot);
		ps.setBoolean(4, false);
		ps.setString(5, lib.getNombre_libro());
		ps.setInt(6, lib.getCodigo_copia());
		
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
	
	public boolean eliminar(Libro lib)
	{
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		
		String sql = "DELETE FROM libros WHERE codigo_copia=?";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, lib.getCodigo_copia());
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
	
	public boolean buscar(Libro lib)
	{
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConexion();
		
		
		String sql = "SELECT * FROM libros WHERE codigo_copia=?";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, lib.getCodigo_copia());
		rs = ps.executeQuery();
		
		if(rs.next())
		{
			
			
			lib.setCodigo_copia(rs.getInt("codigo_copia"));
			lib.setNumero_ISBN(rs.getString("numero_isbn"));
			lib.setCategoria(rs.getString("categoria"));
			//lib.set
			lib.setEstado(rs.getBoolean("estado"));
			lib.setNombre_libro(rs.getString("nombre_libro"));
			
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
