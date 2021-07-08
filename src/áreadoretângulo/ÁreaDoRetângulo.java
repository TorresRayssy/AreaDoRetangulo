package áreadoretângulo;

import java.util.Scanner;

public class ÁreaDoRetângulo {

    public static void main(String[] args) {
        String resp;
        float comprimento, altura;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Para cálcular a área do Retângulo digite:\ncomprimento ");
            comprimento = teclado.nextFloat();
            System.out.print("altura ");
            altura = teclado.nextFloat();

            float r = comprimento * altura;

            if (comprimento < 0 || altura < 0) {
                System.out.println("ERRO, valor negativo.");
            } else {
                System.out.println("A area do retangulo é " + r);
            }

            System.out.println("Deseja continuar? [sim/não]");
            resp = teclado.next();

        } while (resp.equals("sim"));

        System.out.println("Aplicativo encerrado");

    }

}
