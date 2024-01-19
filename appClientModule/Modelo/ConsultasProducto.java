package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasProducto extends Conexion{

	public boolean registrar(Producto pro)
	{
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		
		String sql = "INSERT INTO usuarios (codigo_usuario, nombres, fecha_nacimiento, telefono, estado)"
				+ "VALUES(?,?,?,?,?)";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, pro.getCodigo_usuario());
		ps.setString(3, pro.getNombres());
		ps.setString(4, pro.getFecha_nacimiento());
		ps.setString(5, pro.getTelefono());
		ps.setBoolean(6, false);
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
	
	public boolean modificar(Producto pro)
	{
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		
		String sql = "UPDATE usuarios SET nombres=?, fecha_nacimiento=?, telefono=?, estado=?, WHERE codigo_usuario=?";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, pro.getCodigo_usuario());
		ps.setString(2, pro.getNombres());
		ps.setString(3, pro.getFecha_nacimiento());
		ps.setString(4, pro.getTelefono());
		ps.setBoolean(5, false);
		ps.setInt(6, pro.getId());
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
	
	public boolean eliminar(Producto pro)
	{
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		
		String sql = "DELETE FROM usuarios WHERE codigo_usuario=?";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, pro.getCodigo_usuario());
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
	
	public boolean buscar(Producto pro)
	{
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConexion();
		
		
		String sql = "SELECT * FROM usuarios WHERE codigo_usuario=?";
		
		try {
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, pro.getCodigo_usuario());
		rs = ps.executeQuery();
		
		if(rs.next())
		{
			
			pro.setCodigo_usuario(rs.getInt("codigo_usuario"));
			pro.setNombres(rs.getString("nombres"));
			pro.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
			pro.setTelefono(rs.getString("telefono"));
			pro.setEstado(rs.getBoolean("estado"));
			
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
