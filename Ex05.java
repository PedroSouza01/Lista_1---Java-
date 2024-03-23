
/*Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valorda variável A passe a ser o valor da variável B e o valor da variável B passe a ser o valor da variável A. Apresentar uma mensagem com o valor original de cada variávele outra com os valores trocados.*/
import java.util.Scanner;

public class Ex05 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número para efetuar a troca: ");
        int a = scan.nextInt();

        System.out.println("Digite o segundo número para efetuar a troca: ");
        int b = scan.nextInt();

        System.out.println("O valor original é " + a + " e " + b);
        System.out.println(" ");
        System.out.println("O valor trocado é " + b + " e " + a);

        scan.close();
    }
}
