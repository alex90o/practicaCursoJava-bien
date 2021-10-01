package elgrantito;

import java.sql.Connection;
import java.sql.DriverManager;



public class Conexion {
public static Connection obtConexion() throws Exception{
	//nombre de driver
	//String dbDriver = "com.mysql.jdbc.Driver";
	String dbDriver = "org.mariadb.jdbc.Driver";
	//para establecer la url y la base de datos
	String dbUrlyBase = "jdbc:mysql://localhost/cafetito";
	//usario por lo general root
	String dbUser = "root";
	//contraseña por lo general vacias si nose cambio
	String dbContasenia= "";
	// establece el driver de conexion
	Class.forName(dbDriver).newInstance();
	
	//Retorna conexion
	Connection conex = DriverManager.getConnection(dbUrlyBase, dbUser, dbContasenia);
	return conex;
	
	
}
}
