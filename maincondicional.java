Programação de Soluções Computacionais - Estrutura Condicional


1. Faça um programa que receba dois números e mostre o maior e o menor. Emita uma mensagem, caso os dois sejam iguais.

import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    
	  Scanner leia = new Scanner(System.in);
	   
	  
	   int n1, n2; 
	   
	   System.out.println("Digite o primeiro valor ");
	   n1 = leia.nextInt();
	   
	   System.out.println("Digite o segundo valor ");
	   n2 = leia.nextInt();
	   
	   if(n1>n2){
	    System.out.println("Maior "+n1);
	    System.out.println("Menor "+n2);
	    
	   }
	   
	   else if(n2>n1) {
	       System.out.println("Maior "+n2);
	       System.out.println("Menor "+n1);
	   }
	    
	   else { 
	       System.out.println("Os valores são iguais");
	   }

	}
}

2. Faça um programa que receba as duas notas de um aluno, calcule sua média, e que imprima a sua situação: 
>= 7 -> Aprovado
< 7 -> Reprovado
  
import java.util.Scanner;
public class Main{

public static void main(String[] args) {
	    
Scanner leia = new Scanner(System.in);

double soma, a1, a2, media; 
	
System.out.println("Digite sua 1° nota ");
a1 = leia.nextDouble();
	  
System.out.println("Digite sua 2° nota ");
a2 = leia.nextDouble();
   
soma = a1+a2;
	
media = soma / 2;
System.out.println("Você obteve uma média de "+media);

if (soma > 70){ 
System.out.println("Você tirou "+soma+ " Está Aprovado");
} 
else{ 
System.out.println("Você tirou " +soma+ " Está Reprovado");
}

}
    }

3. Faça um programa que receba 3 notas de um aluno, calcule e mostre uma mensagem de acordo com sua média:

import java.util.Scanner;
public class Main{
    
	public static void main(String[] args) {
	int a1, a2, a3;
	double soma, media;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite a 1° nota: ");
	a1 = leia.nextInt();
	System.out.println("Digite a 2° nota: ");
	a2 = leia.nextInt();
    System.out.println("Digite a 3° nota: ");
	a3 = leia.nextInt();
  
	soma = a1+a2+a3; 
	media = soma / 3;
	System.out.println("A media das suas notas foram "+media);
	System.out.println("A somativa das suas notas foi "+soma);
	
	if (media >= 7) { 
	System.out.println("Aprovado");
	} 
	else if (media >= 4) { 
	System.out.println("Exame");
	}
	else {
	System.out.println("Exame");   
	}
	
  }
}

4. Dados três valores X,Y,Z, verificar se eles podem ser os comprimentos dos lados de um triângulo. Se eles não formarem um triângulo escrever uma mensagem. Considerar que o comprimento de cada lado de um triângulo é menor que a soma dos outros dois lados.
import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	
	float x, y, z; 
	
	System.out.println("Informe o valor de x:");
    x = leia.nextFloat();
	
	System.out.println("Informe o valor de y:");
    y = leia.nextFloat();
    
	System.out.println("Informe o valor de z:");
    z = leia.nextFloat();
	
    if (x == y && y == z){ 
    System.out.println("Triangulo Equilaterio");
    }
    
    else if ( x == y || x == z || y== z){
     System.out.println("Tringulo Isosceles");
     
    }
    
    else { 
        System.out.println("Não é um triangulo");
    }
    
}
}


5. Faça um programa que leia o sexo e a altura (H - em metros) de uma pessoa, calcule e apresente seu peso ideal utilizando as seguintes fórmulas: 
Peso ideal (homens) = (72,7 * H) – 58. 
Peso ideal (mulheres) = (62,1 * H) – 44,7
Sugestão: para identificar o sexo da pessoa, solicite ao usuário que informe 1 para homens, e 2 para mulheres

import java.util.Scanner; 
public class Main{ 

    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);   
       
    double  altura, pesoideal;
    String sexo;
    
    System.out.println("Digite sua altura:");
    altura = leia.nextDouble();
    
    System.out.println("Digite seu sexo [F] ou [M]:");
    sexo = leia.next();
    
    if(sexo.equals("M")) {
        pesoideal = 72.7*altura - 58;
    }
    else {
        pesoideal = 62.1*altura - 44.7;
    } 
  
    System.out.println("O seu peso ideal é " +pesoideal);
}
}


6. Construa um programa para determinar se o indivíduo está com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida como sendo a relação entre o peso (PESO – em kg) e o quadrado da Altura (ALTURA – em m) do indivíduo. Ou seja,
IMC= PESO/ALTURA2


7. Uma empresa decide dar aumento de 30% aos funcionários com salários inferiores a R$1000,00. Faça um programa que receba o salário do funcionário e mostre o valor do salário reajustado ou uma mensagem, caso o funcionário não tenha direito ao aumento.


8. Faça um programa que receba a idade de um nadador e mostre a sua categoria

9. Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral: 
- não eleitor (abaixo de 16 anos); 
- eleitor obrigatório (entre a faixa de 18 e menor de 65 anos); 
- eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive)



10. Faça um programa que leia o um número inteiro entre 1 e 7 e escreva o dia da semana correspondente. Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe dia da semana com esse número.




12. Faça um programa que leia um número inteiro entre 1 e 12 e escrever o mês correspondente. Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe mês com este número.




14. Faça um programa que solicite ao usuário que informe dois números e que exiba o seguinte menu:
1 – Somar
2 – Subtrair 
3 – Multiplicar
4 – Dividir
5 – Sair
Em seguida, leia a opção escolhida e exiba o resultado de acordo com a opção.

