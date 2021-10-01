package elgrantito;

import java.beans.Statement;
import java.sql.Connection;

public class PersonaDAO {

	public static void insertar(Pesona per) throws Exception{
		Connection co = Conexion.obtConexion();
		String sql = "insert into personas (nombre, apellido, edad)"
				+ "value ('"+per.getNombre()+"', '"+per.getApellido()+ "', "+
				per.getEdad()+")";
		java.sql.Statement stm = co.createStatement();
		stm.execute(sql);
		stm.close();
		co.close();
		
		
	}
	
	public static void modifica(Pesona per) throws Exception{
		Connection co = Conexion.obtConexion();
		String sql = "update personas set nombre = '"+ per.getNombre()+
				"' ,apellido = '" + per.getApellido()+ "' ,edad =  '"+per.getEdad()+
				"' where idperosnas = '"+ per.getIdpersona()+"'";
		java.sql.Statement stm = co.createStatement();
		stm.execute(sql);
		stm.close();
		co.close();
		
		
	}
	
}
