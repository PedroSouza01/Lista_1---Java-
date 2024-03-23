
/* Escreva um algoritmo que leia um número e diga, através de uma mensagem, se este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo o usuário também deverá ser informado.*/
import java.util.Scanner;

public class Ex07 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número e saiba se ele está no intervalo entre 100 e 200: ");
        int num = scan.nextInt();

        if (num >= 100 && num <= 200) {
            System.out.println("!O número está entre 100 e 200!");
        } else {
            System.out.println("!ATEÇÃO! O NÚMERO NÃO ESTÁ ENTRE 100 E 200");
        }
        scan.close();
    }
}
