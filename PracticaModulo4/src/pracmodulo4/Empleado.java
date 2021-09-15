package pracmodulo4;

public class Empleado extends Persona{
	protected String fechaDeCargo;
	protected double sueldo;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String apellido, String tipoDocumento, int numeroDocumento, String fechaDeNacimiento,
			String fechaDeCargo, double sueldo) {
		super(nombre, apellido, tipoDocumento, numeroDocumento, fechaDeNacimiento);
		this.fechaDeCargo = fechaDeCargo;
		this.sueldo = sueldo;
	}
	
	

	public String getFechaDeCargo() {
		return fechaDeCargo;
	}

	public void setFechaDeCargo(String fechaDeCargo) {
		this.fechaDeCargo = fechaDeCargo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	
	
	@Override
	public String toString() {
		return "Empleado [fechaDeCargo=" + fechaDeCargo + ", sueldo=" + sueldo + ", nombre=" + nombre + ", apellido="
				+ apellido + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
	}

	@Override
	public String informarTipoDePersona() {
		// TODO Auto-generated method stub
		return "Es una Persona de Tipo Empledo";
	}

}
