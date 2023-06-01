import java.util.Scanner;
public class ExercicioOito {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Programação de soluções computacionais");
        System.out.println("\tLista de exercicio 5");

        System.out.println("Por favor, insira o valor do produto:");
        double valorProduto = scanner.nextDouble();

        System.out.println("Por favor, insira a taxa de imposto:");
        double taxaImposto = scanner.nextDouble();

        scanner.close();

        double valorTotalProduto = somaImposto(valorProduto,taxaImposto);

        System.out.println("O valor total do produto é de R$: " + valorTotalProduto);


    }

    private static double somaImposto(double valorProduto, double taxaImposto){

        double valorTotalProduto;

        valorTotalProduto = (valorProduto*taxaImposto)/100;
        valorTotalProduto = (valorTotalProduto + valorProduto);

        return valorTotalProduto;
    }
}
