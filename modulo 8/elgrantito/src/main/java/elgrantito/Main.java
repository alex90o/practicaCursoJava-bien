package elgrantito;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection co = Conexion.obtConexion();
		if (co == null) {
			System.out.println("No se conecto a la Base");
		}else {
			System.out.println("Si se conecto a la Base");
		}
	}

}
