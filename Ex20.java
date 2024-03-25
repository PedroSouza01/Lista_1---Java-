/* Elabore um algoritmo que calcule a quantidade de litros de combustível gasta emuma viagem, utilizando um automóvel que faz 12km por litro e considerando que sãofornecidos o tempo em hora e a velocidade média da viagem. */

import java.util.Scanner;

public class Ex20 {

    public static Float calculo(float tempo, float velocidade) {
        return (tempo * velocidade) / 12;
    }

    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tempo (Horas) da viagem: ");
        float tempo = scan.nextFloat();

        System.out.println("Digite a velocidade média percorrida durante a viagem: ");
        float velocidade = scan.nextFloat();

        System.out
                .println(
                        "A quantidade de litros gastos (considerando que o veiculo faz 12km por litro)  numa viagem é de: "
                                + calculo(tempo, velocidade) + " litros");

        scan.close();
    }

}
