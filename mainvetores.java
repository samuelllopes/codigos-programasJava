

1- No último Grande Prêmio de Fórmula 1, realizado este ano, foram registrados os tempos, em segundos, das 10 primeiras voltas de um determinado piloto.

Faça um programa em Java que solicite, ao usuário, o tempo de cada uma dessas 10 voltas, e que imprima:

- A média, em segundos, de todas as voltas
- Qual foi a volta mais rápida, e o tempo registrado na volta mais rápida
- Qual foi a volta mais lenta, e o tempo registrado na volta mais lenta
- Imprima inicialmente todas as voltas que tiveram o tempo abaixo da média, e o tempo registrado para cada uma dessas voltas
- Imprima em seguida todas as voltas que tiveram o tempo acima da média, e o tempo registrado para cada uma dessas voltas.


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double voltas[] = new double[10], contVolta=0, melhortempo = 0, piortempo = 0; 
        int voltarapida = 0, voltalenta = 0; 
        
        for (int i=0; i<10; i++){
            System.out.printf("Digite o tempo em segundos da %dª volta: ",i+1); 
            voltas[i] = leia.nextDouble();
            contVolta = contVolta + voltas[i];
            melhortempo = voltas[i];
            piortempo = voltas[i];
        }
         
        for(int i=0 ; i<10 ; i++){     
        if(voltas[i]>melhortempo){
            melhortempo = voltas[i];
            voltarapida = i+1;
            }
        if(voltas[i]<melhortempo){
            piortempo = voltas[i];
            voltalenta = i+1;
            }
        }
        
        
        double media = contVolta/voltas.length;
        System.out.println("\n ==================== MÉDIA DAS VOLTAS ========================= \n");
        System.out.printf("\nA média de tempo das voltas foi de "+media+ " segundos\n"); 
        
        System.out.println("\n ==================== VOLTAS COM PIOR E MELHOR TEMPO ========================= \n");
        System.out.printf("\n A volta com melhor tempo foi a " +voltalenta+"ª com o tempo de " +piortempo+ " segundos \n");
        System.out.printf("\n A volta com pior tempo foi a " +voltarapida+"ª com o tempo de " +melhortempo+" segundos \n");

        System.out.println("\n ======== VOLTAS ACIMA DA MÉDIA ================ \n");
        
        for (int i = 0; i < 10; i++) {
            if(voltas[i]>media)
                System.out.println("\nA volta " +(i+1)+ " ficou acima da média, com tempo de: "+voltas[i]+ " segundos. ");
        }
        System.out.println("\n ======== VOLTAS ABAIXO DA MÉDIA ================ \n");
        for (int i = 0; i < 10; i++) {
            if(voltas[i]<media)
                System.out.println("\n A volta " +(i+1)+ " ficou abaixo da média, com tempo de: "+voltas[i]+ " segundos. ");
        }
        
    }
    
}



2- Faça um programa que leia um vetor com as notas de 4 alunos e imprima o aluno com a maior nota e com a menor nota e a media das notas.
  
  
import java.util.Scanner; 
public class Main{
    
public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    
    String nomes[] = new String[10];
    double notas[] = new double[10];
    double soma = 0, media; 
    int nomeMaior = 0, nomeMenor = 0;

    for (int i = 0; i < 10; i++) {
     System.out.println("Digite o nome do aluno: "+(i+1)+"º");
        nomes[i] = leia.next();

      System.out.println("Insira a nota do aluno: "+(i+1)+"º");
        notas[i] = leia.nextDouble();
      
}
    for (int i = 0; i < 10; i++) {
        soma += notas[i];

    if (notas[i] > notas[nomeMaior]) {
        nomeMaior = i;
}
    if (notas[i] < notas[nomeMenor]) {
        nomeMenor = i;
   }

}
    media = soma / notas.length;

    System.out.println("A Média das notas dos alunos foi: " + media);
    System.out.println("O aluno com maior nota foi " + nomes[nomeMaior] + " e sua nota foi " + notas[nomeMaior]);
    System.out.println("O aluno com menor nota foi " + nomes[nomeMenor] + " e sua nota foi " + notas[nomeMenor]);

}
}



  
