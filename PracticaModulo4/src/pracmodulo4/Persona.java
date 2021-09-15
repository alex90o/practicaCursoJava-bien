package pracmodulo4;

public abstract class Persona {
protected String nombre;
protected String apellido;
protected String tipoDocumento;
protected int numeroDocumento;
protected String fechaDeNacimiento;

public Persona(String nombre, String apellido, String tipoDocumento, int numeroDocumento, String fechaDeNacimiento) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.tipoDocumento = tipoDocumento;
	this.numeroDocumento = numeroDocumento;
	this.fechaDeNacimiento = fechaDeNacimiento;
}

public  Persona() {
	
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

public String getTipoDocumento() {
	return tipoDocumento;
}

public void setTipoDocumento(String tipoDocumento) {
	this.tipoDocumento = tipoDocumento;
}

public int getNumeroDocumento() {
	return numeroDocumento;
}

public void setNumeroDocumento(int numeroDocumento) {
	this.numeroDocumento = numeroDocumento;
}

public String getFechaDeNacimiento() {
	return fechaDeNacimiento;
}

public void setFechaDeNacimiento(String fechaDeNacimiento) {
	this.fechaDeNacimiento = fechaDeNacimiento;
}
//metodo informa que tipo de persona es
public abstract String informarTipoDePersona();

//to String

}
