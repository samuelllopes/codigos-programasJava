## Programação de Soluções Computacionais - Estrutura Sequencial

1. Leia três números inteiros e imprima a média aritmética entre esses números.

import java.util.Scanner;
public class Main{
	
public static void main(String[] args) {
int n1, n2, n3 , soma, media;
Scanner leia = new Scanner(System.in);
	   
System.out.println("Digite um numero   ");
n1 = leia.nextInt();
       
System.out.println("Digite um numero   ");
n2 = leia.nextInt(); 
        
System.out.println("Digite um numero   ");
n3 = leia.nextInt();    
            
soma = n1+n2+n3; 
media = soma/3;
	        
System.out.println("Á media aritimetrica é "+media);
	
}
 }

2. Faça um programa que receba o ano de nascimento de uma pessoa, o ano atual e imprima:
a. A idade da pessoa no ano atual
b. A idade que a pessoa terá em 2050

 import java.util.Scanner;
  public class Main{

	public static void main(String[] args) {
	    int  idadeatual, nascimento, anoatual, futuro; 
	    
	    Scanner leia = new Scanner(System.in);
	    System.out.println("Boa Noite, complete as Informações abaixo! ");
	    
	    System.out.println("Digite o ano do seu nascimento");
	    nascimento = leia.nextInt();
	  
	    System.out.println("Digite o ano atual");
	    anoatual = leia.nextInt();
	  
	    idadeatual = anoatual - nascimento;
	    
	    futuro = 2050 - nascimento;
	    
	     System.out.println("Sua idade hoje é "+idadeatual);
	    
	    System.out.println("Sua idade em 2050 será "+futuro);
	  
	   
	}
}

3. Faça um programa que receba a cotação do dólar em reais, e um valor que o usuário possui em dólares. Imprima este valor em reais.
  
    import java.util.Scanner;
public class Main{


  public static void main(String[] args) {
      
    Scanner entrada = new Scanner(System.in);
    double cotacao_dolar, valor_dolar,valor_real;

    System.out.print("Digite a cotação do dolar: ");
    cotacao_dolar = entrada.nextDouble();

    System.out.print("Digite o valor em dolar: ");
    valor_dolar = entrada.nextDouble();

    valor_real = cotacao_dolar * valor_dolar;

    System.out.print("O Valor em reais é " + valor_real);

  }

}
4. Faça um programa que calcule e mostre a área de um losango AREA = (DIAGONAL MAIOR * DIAGONAL MENOR)/2

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    
	    
	    Scanner leia = new Scanner(System.in);
	    int dmaior, dmenor, areatotal;
	    
	    System.out.print("Digite a medida da diagonal maior: ");
        dmaior = leia.nextInt();
        
	    System.out.print("Digite a medida da diagonal menor: ");
        dmenor = leia.nextInt();
        
        areatotal = (dmaior * dmenor)/2;
        
		System.out.println("A área do losangolo é "+areatotal);
	}
}

5. Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit (F = (C*1,8) + 32)
 
import java.util.Scanner;
 public class Main{


 public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit; 
		
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();
		
		Fahrenheit = ( 9 * Celsius + 160 ) / 5;

		System.out.print("\n A medida convertida é " + Fahrenheit);
		
	}

}

6. Faça um programa que solicite ao usuário que informe os coeficientes a, b e c de uma equação de segundo grau, e que imprima as raízes desta equação (considere que os valores informados sempre retornarão raízes reais para a equação).

 import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {

		float a, b, c, delta, x1, x2;
		
        Scanner leia = new Scanner(System.in);
        
		System.out.println("Digite o Valor de A ");
		a = leia.nextFloat();
		
		System.out.println("Digite o Valor de B ");
		b = leia.nextFloat();
		
		System.out.println("Digite o Valor de C ");
		c = leia.nextFloat();

		
		delta = b * b - 4 * a * c;
		
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			

			x2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			
			System.out.println("Valor de X1 é " + x1 + 
			"\nValor de X2 é " + x2);

		} else {
			System.out
					.println("Não e possivel calcular esta Raiz, não e um numero real ");
		}

	}

}

7. Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    
	    Scanner leia = new Scanner(System.in);
	    float salariomin, salariofunc, qtdsalarios;
	    
	    System.out.println("Digite o salario minino atual ");
	    salariomin = leia.nextFloat();
	    
	    System.out.println("Digite o seu salario atual ");
	    salariofunc = leia.nextFloat();
	    
	    qtdsalarios = salariofunc/salariomin; 
	    
	    System.out.println("O funcionário ganha "+qtdsalarios+" salários mínimos");
	    
	}
}

8. Leia um número e imprima a tabuada de multiplicar deste número. Por exemplo, para o número 5:
import java.util.Scanner;
public class Main
{

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


9. Receba um número positivo, calcule e mostre:
a. O número digitado ao quadrado
b. O número digitado ao cubo
c. A raiz quadrada do número digitado
d. A raiz cúbica do número digitado.
import java.util.Scanner;
import java.lang.Math;
public class Main{

	public static void main(String[] args) {
	    
	    float n1, quadrado, cubica, raiz1, raiz2;
	    
        Scanner leia = new Scanner(System.in);
        
	    System.out.println("Digite um numero positivo   ");
 	    n1 = leia.nextFloat();
        
    
        System.out.println(+ n1+ " quando elavado ao quadrado é "+ Math.pow(n1,2));
        System.out.println(+ n1+ " quando elavado ao cubo é "+ Math.pow(n1,3));
 	    System.out.println(" a raiz quadrada de " + n1 + " é " + Math.sqrt(n1));
 	    System.out.println(" a raiz cubica de " + n1 + " é " + Math.cbrt(n1));
	   
	}
}



10. Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o garçom. Faça um programa que leia o valor gasto pelo cliente e informe o valor a ser pago de gorjeta.

import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
	    
	    double valorconta, gorjeta ,valorgarçom, totalconta;
	    
	    valorconta = 0;
	    gorjeta = 10;
	    valorgarçom = 0;
	    totalconta = 0;
	    
        Scanner leia = new Scanner(System.in);
        
	    System.out.println("Digite o valor da conta   ");
 	    valorconta = leia.nextDouble();
 	    
 	    valorgarçom = (gorjeta / 100 * valorconta);
 	    
 	    totalconta = (valorconta + valorgarçom);
 	  
        System.out.println("O valor referente a taxa de gorjeta será de "+valorgarçom);
        System.out.println("O valor total da conta será de "+totalconta);
        
	   
	}
}


11. Faça um programa que receba um número inteiro e que imprima o antecessor, o sucessor, o dobro e a metade do número informado. 

import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
	    
	    int n1, antecessor, sucessor, dobro , metade; 
	    
        Scanner leia = new Scanner(System.in);
        
	    System.out.println("Digite um número inteiro" );
 	    n1 = leia.nextInt();
 	 
 	    antecessor = (n1-1);
 	    sucessor = (n1+1);
 	    dobro = (n1*2);
 	    metade = (n1/2);
 	    
 	  
        System.out.println("O antecessor de " +n1+ " é " +antecessor);
        System.out.println("O sucesorr de " +n1+ " é " +sucessor);
        System.out.println("O dobro de " +n1+ " é " +dobro);
        System.out.println("A metade de " +n1+ " é " +metade);
	   
	}
}


12. Faça um programa que, tendo como dados de entrada a altura (H - em metros) de um homem, calcule e apresente seu peso ideal utilizando a seguinte fórmula: 
Peso ideal (P) = (72,7 * H) – 58. 

import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
	    
	    double altura, pesoideal;  
	    
        Scanner leia = new Scanner(System.in);
        
	    System.out.println("Digite a sua altura (Ex: 1.80) ");
 	    altura = leia.nextDouble();
 	 
 	    pesoideal = (72.7 * altura) - 58;
 	  
        System.out.println(pesoideal);
        
	   
	}
}


13. Faça o mesmo programa do item anterior, utilizando a fórmula para o cálculo do peso ideal para mulheres:
Peso ideal (P) = (62,1 * H) – 44,7.

	import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
	    
	    double altura, pesoideal;  
	    
        Scanner leia = new Scanner(System.in);
        
	    System.out.println("Digite a sua altura (Ex: 1.55) ");
 	    altura = leia.nextDouble();
 	 
 	    pesoideal = (62.1 * altura) - 44.7;
 	  
        System.out.println(pesoideal);
        
	   
	}
}




14. Faça um programa que leia duas variáveis e troque o conteúdo dessas duas variáveis. Em seguida, imprima o valor dessas variáveis invertido. Exemplo: A = 7, B = 9. Saída: A = 9, B = 7.

import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
	    
	    int  a , b; 
	    
        Scanner leia = new Scanner(System.in);
        
	    System.out.println("Digite o valor A ");
 	    a= leia.nextInt();
 	    
 	    System.out.println("Digite o valor B ");
 	    b = leia.nextInt();
 	    
 	
 	 
        System.out.println("O valor da A é " +b);
        System.out.println("O valor da B é " +a);
	   
	}
}

        
15. Considerando uma eleição de apenas dois candidatos, faça um programa que leia o número total de eleitores, o número de votos do primeiro candidato e o número de votos do segundo candidato. Em seguida, o programa deverá apresentar o percentual de votos de cada um dos candidatos e o percentual de votos nulos.

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    
    Scanner ler = new Scanner(System.in);
    System.out.println("-------URNA-------");
    System.out.println("(69) Cletinho do Rasta");
    System.out.println("(10) Josias do Barzin");
    System.out.println("(0) Nulo ou Branco");
    System.out.println("-------URNA-------");
    
    int votoTotal = 0;
    int votoJosias = 0;
    int votoCletinho = 0;
    int votoNuloBranco = 0;

    System.out.println("Qual a quantidade total de eleitores?");
    votoTotal = ler.nextInt();

    System.out.println("Quantas pessoas votaram no primeiro candidato?");
    votoCletinho = ler.nextInt();

    System.out.println("Quantas pessoas votaram no segundo candidato?");
    votoJosias = ler.nextInt();

    votoNuloBranco = votoTotal - votoJosias - votoCletinho;

    double votoJosiasPct = votoJosias * 100 / votoTotal;
    double votoCletinhoPct = votoCletinho * 100 / votoTotal;
    double votoNuloBrancoPct = votoNuloBranco * 100 / votoTotal;

    System.out.println("O total de votos foi de " + votoTotal);
    
    System.out.println("A quantidade total de votos no Josias foi de " + votoJosias + " com " + votoJosiasPct  + "% dos votos");
    
    System.out.println("A quantidade total de votos no Cletinho foi de " + votoCletinho + " com " + votoCletinhoPct   + "% dos votos");
    
    System.out.println(  "Quantidade de votos nulos ou brancos foi de " + votoNuloBranco + " com " + votoNuloBrancoPct + "% dos votos");
	    
	    
	}
}

