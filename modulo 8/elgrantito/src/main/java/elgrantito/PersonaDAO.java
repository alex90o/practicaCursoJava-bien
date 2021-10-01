package elgrantito;

import java.sql.Connection;

public class PersonaDAO {

	public static void insertar(Pesona per) throws Exception{
		Connection co = Conexion.obtConexion();
		String sql = "insert into personas (nombre, apellido, edad)"
				+ "value ('"+per.getNombre()+"', '"+per.getApellido()+ "', "+
				per.getEdad()+")";
		
		
	}
}
