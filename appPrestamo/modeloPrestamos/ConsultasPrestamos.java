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
		
		
		String sql = "INSERT INTO prestamos (codigo_prestamo, codigo_foraneo_copia, codigo_foraneo_usuario, fecha_prestamo, fecha_devolucion, estado)"
				+ "VALUES(?,?,?,?,?,?)";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, pre.getCodigo_prestamo());
		ps.setInt(2, pre.getCodigo_foraneo_copia());
		ps.setInt(3, pre.getCodigo_foraneo_usuario());
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
		
		
		String sql = "UPDATE prestamos SET codigo_prestamo=?, codigo_foraneo_copia=?, codigo_foraneo_usuario=?, fecha_prestamo=?, fecha_devolucion=?, estado=? WHERE codigo_prestamo=?";
		
		try {
		
		ps = con.prepareStatement(sql);
		
		ps.setInt(1, pre.getCodigo_foraneo_copia());
		ps.setInt(2, pre.getCodigo_foraneo_usuario());
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
			pre.setCodigo_foraneo_copia(rs.getInt("codigo_foraneo_copia"));
			pre.setCodigo_foraneo_usuario(rs.getInt("codigo_foraneo_usuario"));
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
