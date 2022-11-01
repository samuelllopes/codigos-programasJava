## Programação de Soluções Computacionais / Estruturas de Repetição - FOR


1 - Faça um programa que faça a leitura de 5 valores, e para cada valor, mostre o seu dobro na tela. 

import java.util.Scanner; 
public class Main{

	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
     
     System.out.println("Digite um numero:    ");
	
    for(int i=0; i<5; i++) { 

	int num = leia.nextInt();
    
    System.out.println("O Dobro de "+num+ " é "+2*num);
    } } }

2. Faça um programa que leia um número e que imprima os números ímpares de 1 até o número informado. 

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
	    
	    int n1;

        System.out.println("Digite um numero: ");
        n1 = leia.nextInt();

        for (int num = 1; num <= n1; num++) {
        if ((num%2) == 1) {
        System.out.println(num);
 	     }
	} } }
