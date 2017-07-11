package com.captton.class1;

import java.util.ArrayList;


public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Mariano";
		Boolean esVaron;
		final String mes1 = "Enero";
		String diaDeSemana = "Lunes";
		
		String[] nombres;
		nombres = new String[5];
		
		ArrayList<String> alumnos;
		
		
		nombres[0]="Gaston";
		nombres[1]="Maria";
		nombres[2]="Jose";
		
		System.out.println(nombres[0]);
		
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
		
		
		
		for(int cont=0; cont <= 2; cont++)
		{
			System.out.println("Contador de IF es: "+cont+nombres[cont]);
			
		}
		
		int cont = 0;
		while (cont<=2){
			System.out.println("Contador de IF es: "+cont+nombres[cont]);
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
		
		

		
		
	}

}
