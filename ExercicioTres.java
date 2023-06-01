import java.util.Scanner;
public class ExercicioTres {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);      

        System.out.println("Programação de soluções computacionais");
        System.out.println("\tLista de exercicio 5");

        System.out.println("\nInsira a temperatura em graus Fahrenheit:");
         float grausFahrenheit = scanner.nextFloat();

         double grausCentigrados = converteFahrenheitParaCelsius(grausFahrenheit);
         System.out.printf( "A temperatura convertida para graus celsius é de: %.2f %n"  , (grausCentigrados) );
        scanner.close();
    }
        public static double converteFahrenheitParaCelsius(float grausFahrenheit){


             double grausCentigrados = 0;
             grausCentigrados = ((grausFahrenheit - 32)/1.8);
            
            return grausCentigrados;
        }

}
