package caluladora;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {


        /* Este projeto tem por finalidade somar o total de notas de um caixa de um dia inteiro de trabalho,
       pelo seu respectivo valor, obtendo assim a somatória toral do final do dia.
        */


        // Notas de 2.
        int notas01;
        Scanner teclado1 = new Scanner(System.in);

        System.out.println("Quantidade de notas de 2");
        notas01 = teclado1.nextInt();

        System.out.println("Valor em notas de 2: " + (notas01 * 2));
        int resultado01 = notas01 * 2;
        System.out.println();


        // Notas de 5.
        int notas02;
        Scanner teclado2 = new Scanner(System.in);

        System.out.println("Quantidade de notas de 5");
        notas02 = teclado2.nextInt();

        System.out.println("Valor em notas de 20: " + (notas02 * 5));
        int resultado02 = notas02 * 5;
        System.out.println();

        // Notas de 10.
        int notas03;
        Scanner teclado3 = new Scanner(System.in);

        System.out.println("Quantidade de notas de 10");
        notas03 = teclado3.nextInt();

        System.out.println("Valor em notas de 10: " + (notas03 * 10));
        int resultado03 = notas03 * 10;
        System.out.println();

        // Notas de 20.
        int notas04;
        Scanner teclado4 = new Scanner(System.in);

        System.out.println("Quantidade de notas de 20");
        notas04 = teclado4.nextInt();

        System.out.println("Valor em notas de 20: " + (notas04 * 20));
        int resultado04 = notas04 * 20;
        System.out.println();

        // Notas de 50.
        int notas05;
        Scanner teclado5 = new Scanner(System.in);

        System.out.println("Quantidade de notas de 50");
        notas05 = teclado5.nextInt();

        System.out.println("Valor em notas de 50: " + (notas05 * 50));
        int resultado05 = notas05 * 50;
        System.out.println();

        // Notas de 100.
        int notas06;
        Scanner teclado6 = new Scanner(System.in);

        System.out.println("Quantidade de notas de 100");
        notas06 = teclado6.nextInt();

        System.out.println("Valor em notas de 100: " + (notas06 * 100));
        int resultado06 = notas06 * 100;
        System.out.println();


        // Resultado Total
        System.out.println("Somatoria Total: " + (resultado01 + resultado02 + resultado03 + resultado04 + resultado05 + resultado06));


    }

}
