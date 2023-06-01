import java.util.Scanner;
public class ExercicioDois{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Programação de soluções computacionais");
        System.out.println("\tLista de exercicio 5");

        System.out.println("\nInsira o valor do produto:");
        Float valorProduto = scanner.nextFloat();

        float novoValor = atualizaValorProduto(valorProduto);
        scanner.close();
        System.out.println("\nO valor do produto acrescido de 10% é R$: " + novoValor);

    }

    public static float atualizaValorProduto(float valorProduto){

        float novoValor = (valorProduto * 10)/100;
        novoValor = (novoValor + valorProduto);

        return novoValor;
    }
}