
/*Escreva um algoritmo que receba o número do mês e mostre o mêscorrespondente. Valide mês inválido */
import java.util.Scanner;

public class Ex12 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        System.out.println("Digite um número referente ao mês desejado: ");
        int num = scan.nextInt();

        if (num >= 1 && num <= 12) {
            System.out.println("O mês correspondente ao número é: " + meses[num - 1]);
        } else {
            System.out.println("Número inválido");
        }

        scan.close();
    }
}