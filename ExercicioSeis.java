import java.util.Scanner;

public class ExercicioSeis {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programação de soluções computacionais");
        System.out.println("\tLista de exercicio 5");


        int retornaValor = executaSomaArgumentos(scanner);
        scanner.close();
        System.out.println("A soma total é: " + retornaValor);

   }

   public static int executaSomaArgumentos(Scanner scanner){

          int retornaValor;

          System.out.println("Por favor, insira o primeiro número desejado: ");
          int valor1 = scanner.nextInt();

          System.out.println("Por favor, insira o segundo número desejado: ");
          int valor2 = scanner.nextInt();

          System.out.println("Por favor, insira o terceiro número desejado: ");
          int valor3 = scanner.nextInt();

          retornaValor = (valor1 + valor2 + valor3);

    return retornaValor;
   }
}