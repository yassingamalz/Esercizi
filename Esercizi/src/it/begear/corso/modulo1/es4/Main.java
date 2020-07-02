package it.begear.corso.modulo1.es4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("inserisci una stringa");
	String s = sc.nextLine();
	
	Character c = new Character(s.charAt(0)); 
	c = Character.toUpperCase(c);
	
	s = s.toLowerCase();
	s = s.substring(1,s.length());
	
	s = c+s;
	
	System.out.println(s);
	sc.close();
	}

}
