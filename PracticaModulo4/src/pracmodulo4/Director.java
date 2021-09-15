package pracmodulo4;

public class Director extends Empleado{
private String carrera;

public Director() {
	
}

public Director(String nombre, String apellido, String tipoDocumento, int numeroDocumento, String fechaDeNacimiento,
		String fechaDeCargo, double sueldo, String carera ) {
	super(nombre, apellido, tipoDocumento, numeroDocumento, fechaDeNacimiento, fechaDeCargo, sueldo);
	this.carrera = carera; 
}

public String getCarrera() {
	return carrera;
}

public void setCarrera(String carrera) {
	this.carrera = carrera;
}

@Override
public String toString() {
	return "Director [carrera=" + carrera + ", fechaDeCargo=" + fechaDeCargo + ", sueldo=" + sueldo + ", nombre="
			+ nombre + ", apellido=" + apellido + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento="
			+ numeroDocumento + ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
}

@Override
public String informarTipoDePersona() {
	// TODO Auto-generated method stub
	return "Es una Persona de Tipo Director";
}





}
