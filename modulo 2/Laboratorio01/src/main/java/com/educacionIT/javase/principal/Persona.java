package com.educacionIT.javase.principal;

class Persona {

	// atributos
	String nombre;
	String apellido;
	String tipoDocumento;
	int numeroDocumento;
	byte edad;
	Direccion direccion;
	Documento documento;
	
	public Persona () {
		direccion = new Direccion();
		documento = new Documento();
	}
	
	public Persona(String nombre, String apellido, String tipoDocumento, int numeroDocumento, byte edad,
			Direccion direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.edad = edad;
		this.direccion = direccion;
	}

	public Persona(String nombre, String apellido, String tipoDocumento, int numeroDocumento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	void mostrarAtributos() {
		// utilizamos una variable para que sea mas entendible
		// el tipo de mnensaje o estructura del mensaje es decision del desarrollador
		String mensaje = "nombre=" + nombre + ", apellido=" + apellido + ", tipoDocumento=" + tipoDocumento
				+ ", numeroDocumento=" + numeroDocumento + ", edad=" + edad + " y es "
				+ (edad >= 18 ? "mayor de edad" : "menor de edad");
		System.out.println(mensaje);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", tipoDocumento=" + tipoDocumento
				+ ", numeroDocumento=" + numeroDocumento + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
	
	public String dameTuNombreCompleto() {
		return nombre +" "+ apellido;
	}
	
	public String saluda (String saludo) {
		return "HoLiiis " + saludo;
	}
}
