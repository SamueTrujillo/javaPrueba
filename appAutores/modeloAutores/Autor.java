package modeloAutores;

public class Autor {

	private int codigo_autor;
	private String nombres;
	private String Nacionalidad;
	private String fecha_nacimiento;
	public int getCodigo_autor() {
		return codigo_autor;
	}
	public void setCodigo_autor(int codigo_autor) {
		this.codigo_autor = codigo_autor;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	

}
