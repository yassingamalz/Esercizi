package it.begear.corso.modulo1.es1;

import java.util.Scanner;

public class Main {
	// the sum function
	static void somma (int a ,int b,int c)
	{
		System.out.println("the sum is "+(a+b+c));
	}
	
	// the sott func
	static void sott (int a ,int b,int c)
	{
		System.out.println("the sott is "+(a-b-c));
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 number :)");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("choose an operation (+) or (-)");
		char op = sc.next().charAt(0);
		System.out.println("op is "+op);
		
		
		switch (op) {
			case '+' : somma(a,b,c);
				break;
			case '-' : sott(a,b,c);
				break ;
		}
		
		sc.close();
		
		

	}

}
