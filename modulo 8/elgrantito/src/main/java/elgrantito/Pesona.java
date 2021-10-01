package elgrantito;

public class Pesona {
private int idpersona;
private String nombre;
private String apellido;
private int edad;

public Pesona() {
	
}
public Pesona(int idpersona, String nombre, String apellido, int edad) {
	
	this.idpersona = idpersona;
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
}
public int getIdpersona() {
	return idpersona;
}
public void setIdpersona(int idpersona) {
	this.idpersona = idpersona;
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
@Override
public String toString() {
	return "Pesona [idpersona=" + idpersona + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
}



}
