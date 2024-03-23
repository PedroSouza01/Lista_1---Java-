
/* Escreva um algoritmo que leia um número e mostre uma mensagem caso estenúmero seja maior ou igual a 50, outra se ele for menor que 50 */
import java.util.Scanner;

public class Ex08 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if (num >= 50) {
            System.out.println("O número é maior ou igual a 50");
        } else {
            System.out.println("O número é menor ou igual a 50");
        }
        scan.close();
    }
}
