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
