import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Programação de soluções computacionais");
        System.out.println("\tLista de exercicio 5");

        System.out.println("Insira um número positivo ou negativo: ");    
          int numeroUsuario = scanner.nextInt();  

          String retornaValor = retornaValorUsuario(numeroUsuario);

          System.out.println("o número informa é: " + retornaValor);
          
          scanner.close();
    
    }

    private static String retornaValorUsuario (int numeroUsuario){

        String retornaValor ="";
        
                if (numeroUsuario <= 0){

                    retornaValor = "n";

                } else { retornaValor = "p"; }


                

        return retornaValor;
    }
    

}
