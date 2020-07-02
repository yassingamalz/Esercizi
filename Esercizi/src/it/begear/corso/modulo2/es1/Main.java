package it.begear.corso.modulo2.es1;

import java.util.Scanner;

public class Main {
	
	static int piuGrande(int[] rettangoli) {
		int piuGrande=0;
		for(int i=0;i<rettangoli.length;i++) {
			if(i==0)
			piuGrande=rettangoli[i];
			
			if(piuGrande<rettangoli[i])
			piuGrande = rettangoli[i];
		}
			
		
		return piuGrande;
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		int [] rettangoli = new int[2];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci altezza primo rettangolo");
		int altezza = sc.nextInt();
		System.out.println("inserisci lunghezza primo rettangolo");
		int lunghezza = sc.nextInt();
		int conta =0;
		rettangoli[conta++] = (altezza*lunghezza) ;
		System.out.println("******************************");
		
		System.out.println("inserisci altezza secondo rettangolo");
		 altezza = sc.nextInt();
		System.out.println("inserisci lunghezza secondo rettangolo");
		 lunghezza = sc.nextInt();
		rettangoli[conta++] = (altezza*lunghezza) ;

		
		System.out.println("area piu' grande =  "+piuGrande(rettangoli));
		sc.close();
	}

}
