package projetofabrica;
import java.util.Scanner;

public class ConversorTempo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int tempoTotalSegundos = scanner.nextInt();

        int horas = tempoTotalSegundos / 3600;
        int minutos = (tempoTotalSegundos % 3600) / 60;
        int segundos = tempoTotalSegundos % 60;

        System.out.println("Tempo convertido:");
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
