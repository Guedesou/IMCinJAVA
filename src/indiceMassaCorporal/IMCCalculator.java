package indiceMassaCorporal;

import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        Double valorPeso = scanner.nextDouble();

        System.out.print("Digite a sua altura: ");
        Double valorAltura = scanner.nextDouble();

        Double resultadoImc = valorPeso / (valorAltura * valorAltura);

        scanner.close();
        System.out.println("Seu IMC é: " + resultadoImc);
    }
}
