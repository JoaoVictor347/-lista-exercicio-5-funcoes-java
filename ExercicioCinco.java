import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programação de soluções computacionais");
        System.out.println("\tLista de exercicio 5");

        System.out.println("\nPor favor, insira o número desejado: ");
        int numeroUm = scanner.nextInt();

        imprimirNumero(numeroUm);
        scanner.close();
    }

    public static void imprimirNumero(int numeroUm){  
        for (int i= 1; i<= numeroUm; i++){            
            for(int j = 1; j <= i; j++){       
                System.out.print(i + " ");            
            }
            System.out.println();                     
        }
    }
}


    
        
        
        
       
    
