import java.util.Scanner;

public class Ex01 {
    public static void executar() {
        System.out.println("Digite um número: ");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num > 10) {
            System.out.println("Número maior que 10!");
        } else if (num < 10) {
            System.out.println("Número menor ou igual a 10!");
        } else {
            System.out.println("Número igual a 10!");
        }
        scan.close();
    }
}
