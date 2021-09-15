package pracmodulo4;

public class Administrativo extends Empleado{

	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrativo(String nombre, String apellido, String tipoDocumento, int numeroDocumento,
			String fechaDeNacimiento, String fechaDeCargo, double sueldo) {
		super(nombre, apellido, tipoDocumento, numeroDocumento, fechaDeNacimiento, fechaDeCargo, sueldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Administrativo [fechaDeCargo=" + fechaDeCargo + ", sueldo=" + sueldo + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
	}

	@Override
	public String informarTipoDePersona() {
		// TODO Auto-generated method stub
		return super.informarTipoDePersona()+   "Admininistrativo";
	}
	
}
