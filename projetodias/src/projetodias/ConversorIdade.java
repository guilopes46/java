package projetodias;
import java.util.Scanner;

public class ConversorIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade em dias: ");
        int idadeDias = scanner.nextInt();

        int anos = idadeDias / 365;
        int meses = (idadeDias % 365) / 30;
        int dias = idadeDias % 30;

        System.out.println("Idade convertida:");
        System.out.println("Anos: " + anos);
        System.out.println("Meses: " + meses);
        System.out.println("Dias: " + dias);
    }
}
