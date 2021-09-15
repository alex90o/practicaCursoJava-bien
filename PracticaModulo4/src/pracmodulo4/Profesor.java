package pracmodulo4;

import java.util.Set;

public class Profesor extends Empleado{
	private Set<String>listaDeCursos;

	public Profesor() {
	
	}

	public Profesor(String nombre, String apellido, String tipoDocumento, int numeroDocumento, String fechaDeNacimiento,
			String fechaDeCargo, double sueldo,Set<String> listaDeCursos) {
		super(nombre, apellido, tipoDocumento, numeroDocumento, fechaDeNacimiento, fechaDeCargo, sueldo);
		this.listaDeCursos = listaDeCursos;
	}

	public Set<String> getListaDeCursos() {
		return listaDeCursos;
	}

	public void setListaDeCursos(Set<String> listaDeCursos) {
		this.listaDeCursos = listaDeCursos;
	}

	@Override
	public String toString() {
		return "Profesor [listaDeCursos=" + listaDeCursos + ", fechaDeCargo=" + fechaDeCargo + ", sueldo=" + sueldo
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", tipoDocumento=" + tipoDocumento
				+ ", numeroDocumento=" + numeroDocumento + ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
	}

	@Override
	public String informarTipoDePersona() {
		// TODO Auto-generated method stub
		return "Es una Persona de Tipo Profesor";
	}
	
	

}
