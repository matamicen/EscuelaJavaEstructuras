package com.captton.class1;

import java.util.ArrayList;
import java.util.Scanner;


public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Mariano";
		Boolean esVaron;
		final String mes1 = "Enero";
		String diaDeSemana = "Lunes";
		
		int[] numeros;
		numeros = new int[5];
		
		ArrayList<String> alumnos;
		
		
		numeros[0]=23;
		numeros[1]=11;
		numeros[2]=14;
		
		System.out.println("El numero en la posicion 0 es:" + numeros[0]);
		
		esVaron = true;
		float resultado;
		resultado = 15f / 2;
		int res2 = (int)resultado;
		
		
		System.out.println("El resultado res2  es"+ res2);
		
		System.out.println("El resultado es"+ resultado);
		
		System.out.println("Hola!"+ name);
		
		if (esVaron==true) System.out.println("es varon");
		else System.out.println("es mujer");
		
		
		switch (diaDeSemana)
		{
			case "Lunes":
				System.out.println("Es Lunes");
			    break;
			case "Martes":
				System.out.println("Es Martes");
			    break;
			case "Miercoles":
				System.out.println("Es Miercoles");
			    break;
			case "Jueves":
				System.out.println("Es Jueves");
			    break;
			case "Viernes":
				System.out.println("Es Viernes");
			    break;
			case "Sabado":
				System.out.println("Es Sabado");
			    break;
			
		}		
		
		
		
		for(int cont=0; cont <= numeros.length -1; cont++)
		{
			System.out.println("Contador de IF es: "+cont);
			System.out.println("El array en esa posicion tiene el numero:" +numeros[cont]);
		}
		
		int cont = 0;
		while (cont<=2){
			System.out.println("Contador de IF es: "+cont);
			System.out.println("El array en esa posicion tiene el numero:" +numeros[cont]);
			cont++;
			
		}
		
		alumnos = new ArrayList<String>();
		
		alumnos.add("Jorge");
		alumnos.add("Esteban");
		alumnos.add("Ezequiel");
		alumnos.add("Jessica");
		System.out.println(alumnos.get(2));
		
		for(String alu: alumnos )
		{
			if (alu.equals("Ezequiel")) System.out.println("Encontro a Ezequiel!!");
			System.out.println(alu);
		}
		
		
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Ingrese su nombre: ");
	        String nombre = sc.nextLine();
	        
	        System.out.print("Ingrese su edad: ");
	        int edad = sc.nextInt();
	        
	        
	        System.out.println("Hola, " + nombre + ". Tu edad es: " + edad);
	        
	        if (edad>40)  System.out.println("que viejo estas!!");
		
		
		

		
		
	}

}
