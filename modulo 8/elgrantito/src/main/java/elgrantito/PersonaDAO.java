package elgrantito;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

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
	public static void elimina(int id) throws Exception{
		Connection co = Conexion.obtConexion();
		String sql = "delete from personas where idperosnas = "+id;
		java.sql.Statement stm = co.createStatement();
		stm.execute(sql);
		stm.close();
		co.close();
		
		
	}
	
	public static Pesona getPersona(int idPersona) throws Exception{
		Connection co = Conexion.obtConexion();
		String sql = "select *from personas where idperosnas = "+idPersona;
		java.sql.Statement stm = co.createStatement();
		ResultSet rels = stm.executeQuery(sql);
		Pesona per = new Pesona();
		if (rels.next()) {
			int idperosnas = rels.getInt("idperosnas");
			int edad = rels.getInt("edad");
			String nombre = rels.getString("nombre");
			String apellido = rels.getString("apellido");
			
			per.setEdad(edad);
			per.setIdpersona(idperosnas);
			per.setApellido(apellido);
			per.setNombre(nombre);
			
			}
		
		stm.close();
		co.close();
		return per;
		
		
	}
	
}
