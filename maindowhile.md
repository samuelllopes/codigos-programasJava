## Programação de Soluções Computacionais - Estruturas de Repetição – WHILE e DO-WHILE

1. Faça um programa que solicite ao usuário que informe a matrícula e as três notas de um conjunto de alunos. O programa deverá exibir a mensagem informando se o aluno foi aprovado (média maior ou igual a 70), exame (nota maior ou igual a 60 e menor que 70) ou reprovado (nota inferior a 60). O programa irá terminar quando o usuário informar uma matrícula negativa. 

                import java.util.Scanner;
                import java.lang.Math;
                public class Main{

            public static void main (String[]args){

          Scanner leia = new Scanner (System.in);

          int  i, validar, validarmatricula, j, k;
          int aluno[] = new int[4];
          double matricula[] = new double[4];
          double nota[] = new double[3];
          double media;

          System.out.println ("-----INFORME A MATRICULA----- ");

          for (i = 0; i < 4; i++) {
          System.out.print ("Digite a matricula do aluno " + (i+1) + ": ");
          matricula[i] = leia.nextDouble ();
          aluno[i] = i;
          }

          System.out.println ("-----SISTEMA DE NOTAS----- ");
          do{
          validar = 0;

          System.out.print ("Digite a matricula do aluno: ");
          validarmatricula = leia.nextInt ();
          for (i = 0; i < 4; i++){
          if (validarmatricula == matricula[i]){

          media = 0;

          for (j = 0; j < 3; j++) {

           System.out.print ("Digite a " + (j + 1) + "ª nota do aluno " + (i+1) + ": ");
              nota[j] = leia.nextDouble();
              media = media + nota[j];
          }
              media = media/3;

              System.out.println ("As notas do aluno " + (i+1) + " foram cadastradas com sucesso!");
              System.out.println ("-----------RESULTADO-----------");
              System.out.println (" A media do aluno " + (i+1) + " foi: " + media);


              if(media >= 70){
                  System.out.println (" O aluno " + (i+1) + " foi APROVADO");
          }   
              else if(media > 60){
                  System.out.println (" O aluno " + (i+1) + " deverá fazer EXAME DE RECUPERAÇÃO");
          }
              else{
                  System.out.println(" O aluno " + (i+1) + " foi REPROVADO");
          }
               i = 4;

               System.out.println("------------------------");
               System.out.println("NOVO LANÇAMENTO");
               System.out.println("------------------------");

              validar = 0;
      } 
              else{

               validar = 1;
           }
                }
                  }

           while(validar == 0);
           System.out.println(" MATRICULA INVÁLIDA. PROGRAMA FINALIZADO");

           }

            }

2. Leia a idade de um número indeterminado de pessoas. Imprima:
- Quantas pessoas possuem idade acima de 50 anos
- A média de idade das pessoas
A leitura será encerrada quando o usuário informar uma idade negativa.







4. A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados sobre o salário e o número de filhos. A prefeitura deseja saber: 
a ) A média do salário da população; 
b ) A média do número de filhos. 
O final da leitura de dados dar-se-á com a entrada de salários negativos. 






5. Faça um programa que solicite ao usuário que informe dois números e que exiba o seguinte menu:

1 – Somar
2 – Subtrair 
3 – Multiplicar
4 – Dividir
5 – Sair

Em seguida, leia a opção escolhida e exiba o resultado de acordo com a opção.
O programa irá executar até que  o usuário escolha a opção 5.
