package modeloPrestamos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ConsultasPrestamos extends ConexionPrestamos {

	public boolean registrar(Prestamo pre)
	{
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		
		String sql = "INSERT INTO prestamos (codigo_prestamo, fecha_foraneo_copia, codigo_foraneo_usuario, fecha_prestamo, fecha_devolucion, estado)"
				+ "VALUES(?,?,?,?,?,?)";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, pre.getCodigo_prestamo());
		//ps.setString(2, pre.get());
		//ps.setString(3, lib.getCategoria());
		ps.setString(4, pre.getFecha_prestamo());
		ps.setString(5, pre.getFecha_devolucion());
		ps.setBoolean(6, pre.isEstado());
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
	
	public boolean modificar(Prestamo pre)
	{
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		
		String sql = "UPDATE prestamos SET codigo_prestamo=?, fecha_foraneo_copia=?, codigo_foraneo_usuario=?, fecha_prestamo=?, fecha_devolucion=?, estado=? WHERE codigo_prestamo=?";
		
		try {
		
		ps = con.prepareStatement(sql);
		
		//ps.setString(1, pre.getNumero_ISBN());
		//ps.setString(2, lib.getCategoria());
		ps.setString(3, pre.getFecha_prestamo());
		ps.setString(4, pre.getFecha_devolucion());
		ps.setBoolean(5, pre.isEstado());
		ps.setInt(6, pre.getCodigo_prestamo());
		
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
	
	public boolean eliminar(Prestamo pre)
	{
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		
		String sql = "DELETE FROM prestamos WHERE codigo_prestamo=?";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, pre.getCodigo_prestamo());
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
	
	public boolean buscar(Prestamo pre)
	{
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConexion();
		
		
		String sql = "SELECT * FROM prestamos WHERE codigo_prestamo=?";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, pre.getCodigo_prestamo());
		rs = ps.executeQuery();
		
		if(rs.next())
		{
			
			
			pre.setCodigo_prestamo(rs.getInt("codigo_prestamo"));
			//lib.setNumero_ISBN(rs.getString("numero_isbn"));
			//lib.setCategoria(rs.getString("categoria"));
			pre.setFecha_prestamo(rs.getString("fecha_prestamo"));
			pre.setFecha_devolucion(rs.getString("fecha_devolucion"));
			pre.setEstado(rs.getBoolean("vigente"));
			
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
