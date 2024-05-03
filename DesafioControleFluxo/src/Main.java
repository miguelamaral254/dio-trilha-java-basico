import entities.Contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = scanner.nextInt();

            Contador.contar(parametroUm, parametroDois);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
