package modeloPrestamos;

public class Prestamo {

	private int codigo_prestamo;
	private int codigo_foraneo_copia;
	private int codigo_foraneo_usuario;
	private String fecha_prestamo;
	private String fecha_devolucion;
	private boolean estado;
	
	
	
	public int getCodigo_foraneo_copia() {
		return codigo_foraneo_copia;
	}
	public void setCodigo_foraneo_copia(int codigo_foraneo_copia) {
		this.codigo_foraneo_copia = codigo_foraneo_copia;
	}
	public int getCodigo_foraneo_usuario() {
		return codigo_foraneo_usuario;
	}
	public void setCodigo_foraneo_usuario(int codigo_foraneo_usuario) {
		this.codigo_foraneo_usuario = codigo_foraneo_usuario;
	}
	public int getCodigo_prestamo() {
		return codigo_prestamo;
	}
	public void setCodigo_prestamo(int codigo_prestamo) {
		this.codigo_prestamo = codigo_prestamo;
	}
	public String getFecha_prestamo() {
		return fecha_prestamo;
	}
	public void setFecha_prestamo(String fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}
	public String getFecha_devolucion() {
		return fecha_devolucion;
	}
	public void setFecha_devolucion(String fecha_devolucion) {
		this.fecha_devolucion = fecha_devolucion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	

}
