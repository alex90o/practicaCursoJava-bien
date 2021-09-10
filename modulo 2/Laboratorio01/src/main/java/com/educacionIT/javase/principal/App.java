package com.educacionIT.javase.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import javax.crypto.AEADBadTagException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
/*
		// Utilizamos la Clase Scanner para pedir los datos por la consola
		Scanner teclado = new Scanner(System.in);

		// declaracion de Variables, sin inicializarlos porque no sabemos el tamano
		Persona[] personas;
		int cantPersonas;

		// mostramos por pantalla
		System.out.println("Ingreso de Datos de Personas Laboratorio 1");
		// mostramos un salto de linea para diferenciar el titulo
		System.out.print("\n");

		// pregunta a usuario
		System.out.print("Ingrese la cantidad de Personas que cargara: ");

		// capturamos lo que el usuario ingresa y lo asignamos como tamaño del
		// vector, recuerden Int para capturar es un entero y saber cantidad de personas
		cantPersonas = teclado.nextInt();
		personas = new Persona[cantPersonas];

		// usamos un for para preguntar cada uno de los datos de las personas
		for (int i = 0; i < personas.length; i++) {
			// preguntamos los datos de las personas y podemos usar un objeto auxiliar
			Persona personaAuxiliar = new Persona();
			System.out.print("Ingrese el Nombre de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.nombre = teclado.next();
			System.out.print("Ingrese el Apellido de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.apellido = teclado.next();
			System.out.print("Ingrese el Tipo de Documento de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.tipoDocumento = teclado.next();
			System.out.print("Ingrese el Numero de Documento de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.numeroDocumento = teclado.nextInt();
			System.out.print("Ingrese el Edad de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.edad = teclado.nextByte();

			// asignamos el objeto auxiliar a la posicion del vector correspondiente
			personas[i] = personaAuxiliar;
			System.out.println();

		}
		// mostramos un salto de linea para diferenciar el titulo
		System.out.print("\n");

		// mostramos las notas, en este metodo uso el .length y no la variable cantidad
		// solo a modo de ejemplo
		System.out.println("Datos de las Personas");
		for (int i = 0; i < personas.length; i++) {
			// mostramos los datos de las personas

			personas[i].mostrarAtributos();

		}

		// debemos cerrar la comunicacion con la consola, no nos preocupemos ya que lo
		// veremos mas adelante el por qué de esto :)
		teclado.close();
		*/
		///pruebas del modulo 2
		Persona persona1 = new Persona();
		persona1.apellido = "Cabrera";
		persona1.nombre = "Tito";
		persona1.edad = 9;
		System.out.println(persona1);
		
		Direccion domicilo = new Direccion();
		domicilo.calle = "Las Tacuaras";
		domicilo.numero = 2356;
		persona1.direccion = domicilo;
		System.out.println(persona1.direccion);
		System.out.println(persona1);
		System.out.println(persona1.dameTuNombreCompleto());
		System.out.println(persona1.saluda(" buenas Gente : )"));
		persona1.direccion.calle = "UNa calle";
		System.out.println(persona1);
		
		//---
		ArrayList<Persona> listPersonas = new ArrayList<>();
		persona1.documento.numero=3131;
		persona1.documento.tipo="DNI";
		
		Persona persona2 = new Persona();
		persona2.apellido = "Martinez";
		persona2.nombre = "Cristian";
		persona2.documento.numero=54344;
		persona2.documento.tipo="DNI";
		
		Persona persona3 = new Persona();
		persona3.apellido = "Sanchez";
		persona3.nombre = "Horacio";
		persona3.documento.numero=14344;
		persona3.documento.tipo="DNI";
		
		Persona persona4 = new Persona("Negra","Cabrera", "cdu", 64623);
		
		listPersonas.add(persona1);
		listPersonas.add(persona2);
		listPersonas.add(persona3);
		listPersonas.add(persona4);
	for (int j = 0; j < listPersonas.size(); j++) {
		System.out.println(listPersonas.get(j));
	}	
	
		
	}

}
