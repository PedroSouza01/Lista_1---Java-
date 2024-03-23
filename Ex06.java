
/* Ler uma temperatura em graus Celsius e apresentá-la convertida em grausFahrenheit. A fórmula de conversão é:F = (9 * C + 160) / 5 */
import java.util.Scanner;

public class Ex06 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celcius: ");
        int tempC = scan.nextInt();

        int tempF = (9 * tempC + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + tempF);

        scan.close();
    }
}