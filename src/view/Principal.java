package view;

import controller.ConverteController;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConverteController converteController = new ConverteController();

        System.out.print("Insira um número decimal (até 1000): ");
        int num = scanner.nextInt();

        if (num < 0 || num > 1000) {
            System.out.println("Número inválido.");
        } else {
            String binario = converteController.bin(num);
            System.out.println("O valor binário é: " + binario);
        }

        scanner.close();
    }
}
