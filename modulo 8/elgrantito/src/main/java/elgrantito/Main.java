package elgrantito;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		Connection co = Conexion.obtConexion();
		if (co == null) {
			System.out.println("No se conecto a la Base");
		}else {
			System.out.println("Si se conecto a la Base");
		}
		*/
		
		/*
		//insertar persona
		Pesona tito = new Pesona("Nicolas","De la Cluz", 24);
		PersonaDAO.insertar(tito);
		*/
		
		/*
		//modifica persona
		Pesona tito = new Pesona("Enzo","Perez", 31);
		tito.setIdpersona(3);
		PersonaDAO.modifica(tito);
		*/
		//elimina perosna
		//PersonaDAO.elimina(3);
		
		//devolver una persona de la base de datos
		Pesona p = PersonaDAO.getPersona(1);
		System.out.println(p.toString());
		
		
	}

}
