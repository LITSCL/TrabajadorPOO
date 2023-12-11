package cl.inacap.model;

public class Trabajador {
	private String nombre;
	private String apellido;
	private int edad;
	private String pais;
	private String tecnologia;
	private String comentario;
	private String experiencia;
	
	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTecnologia() {
		return tecnologia;
	}
	
	public void setTecnologia(String teconologia) {
		this.tecnologia = teconologia;
	}
}
