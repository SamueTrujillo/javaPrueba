package modeloLibros;

public class Libro {
	
	private int codigo_copia;
	private String numero_ISBN;
	private String categoria;
	private boolean estado;
	private String nombre_libro;
	public int getCodigo_copia() {
		return codigo_copia;
	}
	public void setCodigo_copia(int codigo_copia) {
		this.codigo_copia = codigo_copia;
	}
	public String getNumero_ISBN() {
		return numero_ISBN;
	}
	public void setNumero_ISBN(String numero_ISBN) {
		this.numero_ISBN = numero_ISBN;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getNombre_libro() {
		return nombre_libro;
	}
	public void setNombre_libro(String nombre_libro) {
		this.nombre_libro = nombre_libro;
	}


}
