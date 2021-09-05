package nota;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese cantidad de notas");
		int cantidadNotas=teclado.nextInt();
		int [] vectorNotas= new int [cantidadNotas];
		String [] vectorNombre = new String [cantidadNotas];
		int sumaNota=0; double promedio=0.0; int mayor=vectorNotas[0]; int menor=vectorNotas[0];
		int posMayor=0; int posMenor=0;
		for (int i = 0; i < cantidadNotas; i++) {
			System.out.println("ingrese nota del alumno");
			vectorNotas[i]=teclado.nextInt();
			sumaNota = sumaNota + vectorNotas[i];
			System.out.println("ingrese nombre del alumno");
			vectorNombre[i]=teclado.next();
			
		}
		promedio=sumaNota/cantidadNotas;
		System.out.println("El promedio es : " + promedio);
		for (int i = 1; i < cantidadNotas; i++) {
			if(mayor < vectorNotas[i]) {
				mayor=vectorNotas[i];
				posMayor=i;
			}
			if(menor > vectorNotas[i]) {
				menor=vectorNotas[i];
				posMenor=i;
			}
		}
		
		
		System.out.println("El alunos que tuvo la mayor nota fue "+ vectorNombre[posMayor]+" con un puntaje de "+ vectorNotas[posMayor] );
		System.out.println("El alunos que tuvo la menor nota fue "+ vectorNombre[posMenor]+" con un puntaje de "+ vectorNotas[posMenor] );
		
		// Arreglos antes de ordenar
				System.out.println("Notas antes de ordenar:");
				System.out.println(Arrays.toString(vectorNotas));
				System.out.println(Arrays.toString(vectorNombre));
		

	}

}
