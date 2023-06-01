import java.util.Scanner;
public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programação de soluções computacionais");
        System.out.println("\tLista de exercicio 5");

        System.out.println("Por favor, insira o primeiro número desejado: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Por favor, insira o segundo número desejado: ");
        double valor2 = scanner.nextDouble();

        
        System.out.println("Por favor, insira o terceiro número desejado: ");
        double valor3 = scanner.nextDouble();

        double retornoMediaAritmetica = funcaoMediaAritmetica (valor1,  valor2,  valor3);
        double retornoMediaHarmonica = funcaoMediaHarmonica (valor1,  valor2,  valor3);
        double retornoMediaGeometrica = funcaoMediaGeometrica (valor1,  valor2,  valor3);

        scanner.close();
        System.out.printf("A média aritmética é: %.2f %n " , retornoMediaAritmetica);
        System.out.printf("A média harmonica é: %.2f %n " , retornoMediaHarmonica);
        System.out.printf("A média harmonica é: %.2f %n " , retornoMediaGeometrica);
    }

    public static double funcaoMediaAritmetica(double valor1, double valor2, double valor3){

        double retornoMediaAritmetica;

        retornoMediaAritmetica = (valor1 + valor2 + valor3 )/3;

        return retornoMediaAritmetica;

    }

    public static double funcaoMediaHarmonica(double valor1, double valor2, double valor3){

        double retornoMediaHarmonica;

        retornoMediaHarmonica = (3/((1/valor1)+ (1/valor2)+(1/valor3)));

        return retornoMediaHarmonica;

    }

    public static double funcaoMediaGeometrica(double valor1, double valor2, double valor3){

        double retornoMediaGeometrica;

        retornoMediaGeometrica = Math.cbrt(valor1*valor2*valor3);

        return retornoMediaGeometrica;

    }
}
