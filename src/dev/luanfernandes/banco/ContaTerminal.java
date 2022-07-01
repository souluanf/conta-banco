package dev.luanfernandes.banco;

import dev.luanfernandes.banco.model.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Agência: ");
        String agencia = scanner.next();
        System.out.print("Número da Conta: ");
        Integer numero = scanner.nextInt();
        System.out.print("Nome Cliente: ");
        String nome = scanner.next();
        System.out.print("Saldo: ");
        Double saldo = scanner.nextDouble();
        System.out.println(new Conta(agencia, numero, nome, saldo));
    }
}