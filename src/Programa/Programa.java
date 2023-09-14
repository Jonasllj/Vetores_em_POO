package Programa;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int n;
	n = sc.nextInt();
	double [] vetor = new double [n];
	
	for(int i=0; i<n; i++) {
		vetor[i] = sc.nextDouble();
		
	}
	
	double soma = 0;
	
	for(int i=0; i<n; i++) {
		soma = soma + vetor[i];
	}
	
	double media = 0;
	
	media = soma/n;
	
	System.out.println("Media é : " + media);
	
	}
	
}
