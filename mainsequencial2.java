1 - Escreva um algoritmo que leia dois números informados pelo usuário a partir
do teclado e que apresente o resultado da média aritmética dos dois números
informados.

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    
	    int n1, n2, soma; 
	    float media;
	    Scanner leia = new Scanner(System.in);
	    
        System.out.println("Digite um numero   ");
	    n1 = leia.nextInt();
       
       	 System.out.println("Digite um numero   ");
	    n2 = leia.nextInt(); 

	    soma = n1+n2; 
	    media = soma/3;
	    
		System.out.println("Á media aritimetrica é "+media);
	}
}
 
============================================================================

2-  Escreva um algoritmo que leia o preço de um produto a partir do teclado e
apresente na tela o valor do produto acrescido de 10% de seu valor original.
Exemplo:
Informe o valor do produto: 50.00
Novo valor do produto: 55.00


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double preco, novoPreco;

        System.out.print("Informe o valor do produto: ");
        preco = leia.nextDouble();

        novoPreco = preco * 1.1;

        System.out.println("Novo valor do produto: " + novoPreco);
    }
}



==================================================================

3. Escreva um algoritmo que leia uma temperatura fornecida pelo usuário a partir
do teclado em graus Fahrenheit e a converta para o seu equivalente em graus
centígrados.
OBS.: °C = (°F − 32) / 1,8

import java.util.Scanner;
public class Main{


 public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double centígrados, fahrenheit; 
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		fahrenheit = leia.nextDouble();
		
		centígrados = (Fahrenheit - 38 ) / 1.8;

		System.out.print("\n A medida convertida é " +centígrados);
		
	}

}


==================================================================

4. Escreva um algoritmo para calcular os juros compostos de uma aplicação
financeira. O algoritmo deve ler o valor do capital a ser aplicado, o prazo de
aplicação em meses, a taxa de juros mensal e apresentar na tela o montante a
ser recebido.
OBS: M = C × (1 + i) n
 , em que M é o montante a ser recebido, C é o capital
aplicado, i é a taxa de juros e n é o prazo da aplicação.


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double capital, juros, montante;
        int prazo;

        System.out.print("Digite o valor do capital a ser aplicado: ");
        capital = leia.nextDouble();

        System.out.print("Digite o prazo de aplicação em meses: ");
        prazo = leia.nextInt();

        System.out.print("Digite a taxa de juros mensal: ");
        juros = leia.nextDouble();

        montante = capital * Math.pow(1 + juros, prazo);

        System.out.println("O montante a ser recebido é de R$ " + montante);
    }
}

==================================================================

5. Escreva um algoritmo para calcular e imprimir o salário bruto a ser recebido
por um funcionário em um mês.
O programa deverá utilizar os seguintes dados:
a. Número de horas que o funcionário trabalhou no mês.
b. Valor recebido por hora de trabalho.
c. Valor do salário família.
d. Número de filhos com idade menor que 14 anos, para calcular o salário
família.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double valorHora, salarioFamilia, salarioBruto;
        int horasTrabalhadas, numFilhos;

        System.out.print("Informe o número de horas trabalhadas no mês: ");
        horasTrabalhadas = leia.nextInt();

        System.out.print("Informe o valor recebido por hora de trabalho: ");
        valorHora = leia.nextDouble();

        System.out.print("Informe o valor do salário família: ");
        salarioFamilia = leia.nextDouble();

        System.out.print("Informe o número de filhos com idade menor que 14 anos: ");
        numFilhos = leia.nextInt();

        salarioBruto = horasTrabalhadas * valorHora;

        if (numFilhos > 0) {
            salarioBruto += salarioFamilia * numFilhos;
        }

        System.out.println("O salário bruto a ser recebido é R$" + salarioBruto);
    }
}

==================================================================

6. Escreva um algoritmo que receba dois números a partir do teclado. O
algoritmo deve imprimir o logaritmo do primeiro número na base
representada pelo segundo número.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1, n2, resultado; 
        
        System.out.print("Digite o primeiro número: ");
        n1 = leia.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = leia.nextDouble();

        resultado = Math.log(n1) / Math.log(n2);

        System.out.println("O logaritmo de " + n1 + " na base " + n2 + " é: " + resultado);
    }
}

7.Escreva um algoritmo que leia o salário fixo de um vendedor, o valor total das
vendas que ele realizou no mês e o percentual que ele ganha sobre o total das
vendas mensais. O algoritmo deve calcular o salário total do vendedor e
apresentá-lo na tela.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        double salarioFixo, valorVendas, percentualComissao, comissao, salarioTotal;
        
        System.out.print("Digite o salário fixo do vendedor: ");
        salarioFixo = leia.nextDouble();
        
        System.out.print("Digite o valor total das vendas realizadas no mês: ");
        valorVendas = leia.nextDouble();
        
        System.out.print("Digite o percentual de comissão sobre as vendas: ");
        percentualComissao = leia.nextDouble();
        
        comissao = valorVendas * (percentualComissao / 100);
        salarioTotal = salarioFixo + comissao;
        
        System.out.println("O salário total do vendedor é: "+ salarioTotal);
    }
}

==================================================================

8. Em um estacionamento há carros e motos. Escreva um algoritmo que solicite 
ao usuário o total de veículos e o total de rodas. 
O algoritmo deve determinar quantos carros e quantas motos há no 
estacionamento. O resultado deve ser apresentado na tela para o usuário.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int totalVeiculos, totalRodas, qtdCarros = 0 , qtdMotos = 0, numRodas; 


        System.out.println("Informe o total de veículos: ");
        totalVeiculos = leia.nextInt();

        System.out.println("Informe o total de rodas: ");
        totalRodas = leia.nextInt();

        for(int i=1; i<=totalVeiculos; i++) {
            System.out.println("Informe o número de rodas do veículo " + i + ":");
            numRodas = leia.nextInt();

            if(numRodas == 4) {
                qtdCarros++;
            } else if(numRodas == 2) {
                qtdMotos++;
            } else {
                System.out.println("Veículo não identificado");
            }

            totalRodas -= numRodas;
        }

        System.out.println("Quantidade de carros: " + qtdCarros);
        System.out.println("Quantidade de motos: " + qtdMotos);

    }

}

==================================================================

9 . Escreva um algoritmo que receba um número inteiro de segundos a partir do 
teclado e imprima na tela a quantidade correspondente em horas, minutos e 
segundos.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int segundos, horas, minutos; 

        System.out.println("Digite a quantidade de segundos: ");
        segundos = leia.nextInt();

        horas = segundos / 3600;
        segundos = segundos % 3600;

        minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }

}

==================================================================

10.  10. Escreva um algoritmo que, dados três valores, calcule e imprima as médias 
aritmética, harmônica e geométrica destes valores.
OBS.:
a. Média aritmética:
(a + b + c) / 3
b. Média harmônica:
c. Média geométrica


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        double n1, n2, n3, mediaAri, mediaHarmo, mediaGeo;

        System.out.println("Digite o primeiro valor: ");
        n1 = leia.nextDouble();

        System.out.println("Digite o segundo valor: ");
        n2 = leia.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        n3 = leia.nextDouble();

        mediaAri = (n1 + n2 + n3) / 3;
        mediaHarmo = 3 / ((1/n1) + (1/n2) + (1/n3));
        mediaGeo = Math.pow(n1 * n2 * n3, 1.0/3.0);

        System.out.println("Média aritmética: " + mediaAri);
        System.out.println("Média harmônica: " + mediaHarmo);
        System.out.println("Média geométrica: " + mediaGeo);

    }

}
