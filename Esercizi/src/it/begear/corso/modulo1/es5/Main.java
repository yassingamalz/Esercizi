package it.begear.corso.modulo1.es5;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt((100-0)+1)+0;
		System.out.println(a);
	}

}
