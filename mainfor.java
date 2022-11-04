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
	
} 
 }
  }

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
 } 
   }  
     }
		
		
3. Leia um número e imprima a tabuada de multiplicar deste número. Por exemplo, para o número 5:

import java.util.Scanner;
public class Main{

public static void main(String[] args) {
int n1;
	    
Scanner leia = new Scanner(System.in);

System.out.println("Digite um numero   ");
n1 = leia.nextInt();
        
for (int i = 0; i < 10; i++){
 	      
System.out.println(n1 + " x "+ i + " = " + (n1*i));
}   
  }
     }

4. Faça um programa que solicite ao usuário que informe o valor das temperaturas coletadas nos 10 primeiros dias do mês de janeiro de 2021, em Belo Horizonte. Imprima em seguida a média dessas temperaturas.

import java.util.Scanner;
public class Main{
public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);
	  
int soma = 0, media; 
int temperatura[] = new int[10];
	 
for(int i = 0; i < 10; i++) {
	  
System.out.println("Digite a temperatura "+(+i+1));
temperatura[i] = leia.nextInt();
soma = temperatura[i];   
}
      
media = soma / 10;
System.out.println("A média de temperatura é "+media);
        
} 
} 
	     
5. Faça um programa que leia o sexo e o peso de 10 pessoas, e mostre quantas pessoas do sexo masculino possuem peso entre 60 e 80 kg, bem como a quantidade de mulheres que possuem peso entre 50 e 70 kg.

import java.util.Scanner;
public class Main{
public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);
int contM = 0, contF = 0;
String sexo; 
Float peso;
        
for(int i = 0;i < 10;i++){
System.out.println("Seu sexo é M ou F? ");
sexo = leia.next();
        
System.out.println("Digite seu peso: ");
peso = leia.nextFloat();
        
    
if (sexo.equals("m") && (peso >= 60 && peso <= 80)){
contM = contM + 1;
}
      
else if (sexo.equals("f") && (peso >= 50 && peso <= 70)) {
contF = contF + 1;

} 
        
  }
 
System.out.println(contM);
System.out.println(contF);
} 
  }

6. Faça um programa que leia as notas de 5 alunos, e que exiba a maior e menor notas entre elas.
	
import java.util.Scanner;
public class Main{
	
public static void main(String[] args) {
	    
Scanner leia = new Scanner(System.in);
double nota,notaM =0,notaMenor=999;
        
for(int i = 0; i<5;i++){

System.out.println("Insira a nota do aluno: "+(i+1));
nota = leia.nextDouble();

if(nota>notaM)
notaM = nota;
	
if (nota<notaMenor)
notaMenor = nota;

} 
        
System.out.println("A maior nota obtida foi "+notaM);
System.out.println("A menor nota obtida foi "+notaMenor);
	   
}
}

7. Faça um programa que leia a idade e peso de sete pessoas. Calcule e mostre:
- a quantidade de pessoas com mais de 90 kg
- a média das idades das sete pessoas


import java.util.Scanner;
public class Main{

public static void main(String[] args) {
	
Scanner leia = new Scanner (System.in);
int idade, acima, media;
double peso = 0, soma = 0; 
	    
for (int i = 0; i < 7; i++) {
System.out.println("Informe sua idade:");
idade = leia.nextInt(); 
        
System.out.println("informe seu peso: " );
peso = leia.nextDouble();
	
if (peso > 90){
acima++;
}
soma = soma + idade; 
}    
	
media = soma/7;
	 
System.out.println("Há um total de "+acima+ " com mais de 90 kilos.");
System.out.println("A média de idade das pessoas é " +media);
	
 }
   }


