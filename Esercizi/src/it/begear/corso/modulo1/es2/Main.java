package it.begear.corso.modulo1.es2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter a name");
	String nome = sc.nextLine();
	
	System.out.println("enter a surname");
	String cognome = sc.nextLine();
	
	Persona person = new Persona(nome,cognome);
	System.out.println(person.toString());
	
	sc.close();
	}

}
