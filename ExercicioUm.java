import java.util.Scanner;
public class ExercicioUm{

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Programação de soluções computacionais");
        System.out.println("\tLista de exercicio 5");


       float numero = lerNumeros(scanner);
       
       System.out.println("A média aritmética é: " + numero  );
       
        scanner.close();
    }

    public static float lerNumeros(Scanner scanner) {

         float numeroUm, numeroDois, mediaAritmetica;

         System.out.println("Digite o primeiro número desejado: ");
         numeroUm = scanner.nextInt();

         System.out.println("Digite o segundo número desejado: ");
         numeroDois = scanner.nextInt();

         mediaAritmetica = (numeroUm + numeroDois)/2;

        return mediaAritmetica;
     }
}