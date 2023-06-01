import java.util.Scanner;

 class ExercicioNove {
    public static void main(String[] args) {

       String numeroUsuario ="";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programação de soluções computacionais");
        System.out.println("\tLista de exercicio 5");

        do {
        System.out.println("Por favor insira um número: (máximo 3 caracteres)");
         numeroUsuario = scanner.nextLine();

         scanner.close();

        if (numeroUsuario.length() > 3){

          System.out.println("\nquantidade de caracteres errada. por favor corrija:");
          
        } else { break; }

    }while (true);

    funcaoInverteNumero(numeroUsuario);

    }

    private static void funcaoInverteNumero (String numeroUsuario){
      
      char[] numeros = null;
      numeros = numeroUsuario.toCharArray();
      
      System.out.println("\nO número inserido foi: " + numeroUsuario);
      System.out.println("O inverso do número inserido é: " + numeros[2]  + numeros[1]  + numeros[0] );    

    }
}
