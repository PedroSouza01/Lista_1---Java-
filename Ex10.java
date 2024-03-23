
/* Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Casoo usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Númeroinválido!”. */
import java.util.Scanner;

public class Ex10 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero");
        int num = scan.nextInt();

        if (num >= 1 && num <= 5) {
            System.out.println("Númeração aceita");
        } else {
            System.out.println("Númeração Inválida!");
        }
        scan.close();
    }
}
