package ar.unlam.edu.PB2;


public class Deportista {
	
	private Integer numeroDeSocio;
	private String nombre;
	private String estiloPreferido;

	public Deportista (Integer numeroDeSocio, String nombre, String estiloPreferido){
		this.numeroDeSocio= numeroDeSocio;
		this.nombre= nombre;
		this.estiloPreferido= estiloPreferido;
	}

	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public void setNumeroDeSocio(Integer numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstiloPreferido() {
		return estiloPreferido;
	}

	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}
	
	
}
