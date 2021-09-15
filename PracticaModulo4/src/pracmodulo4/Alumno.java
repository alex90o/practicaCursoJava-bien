package pracmodulo4;

import java.util.Set;

public class Alumno extends Persona {
private String fechaDeIngresoo;
private Set<String>ListaDeCurrsos;

//contructor
public Alumno(String nombre, String apellido, String tipoDocumento, int numeroDocumento, String fechaDeNacimiento,
		String fechaDeIngresoo, Set<String> listaDeCurrsos) {
	super(nombre, apellido, tipoDocumento, numeroDocumento, fechaDeNacimiento);
	this.fechaDeIngresoo = fechaDeIngresoo;
	ListaDeCurrsos = listaDeCurrsos;
}

public Alumno() {
	
}
//get set

public String getFechaDeIngresoo() {
	return fechaDeIngresoo;
}

public void setFechaDeIngresoo(String fechaDeIngresoo) {
	this.fechaDeIngresoo = fechaDeIngresoo;
}

public Set<String> getListaDeCurrsos() {
	return ListaDeCurrsos;
}

public void setListaDeCurrsos(Set<String> listaDeCurrsos) {
	ListaDeCurrsos = listaDeCurrsos;
}

//to String
@Override
public String toString() {
	return "Alumno [fechaDeIngresoo=" + fechaDeIngresoo + ", ListaDeCurrsos=" + ListaDeCurrsos + ", nombre=" + nombre
			+ ", apellido=" + apellido + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento
			+ ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
}

@Override
public String informarTipoDePersona() {
	// TODO Auto-generated method stub
	return "Es una Persona de Tipo Alumno";
}





}
