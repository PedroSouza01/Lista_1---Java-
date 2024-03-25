
/* Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seuvolume calculado de acordo com a seguinte fórmula: volume = 3.14 * raio2 * altura;Exemplo: raio = 10, altura = 15. Volume = 471020 */
import java.util.Scanner;

public class Ex19 {

    public static Float calculo(float raio, float altura) {
        return (float) (Math.PI * Math.pow(raio, 2) * altura);
    }

    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        float raio = scan.nextFloat();

        System.out.println("Digite a altura do circulo: ");
        float altura = scan.nextFloat();

        System.out.println("O volume é: " + calculo(raio, altura));

        scan.close();
    }
}
