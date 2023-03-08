package com.teste;

import java.util.ArrayList;
import java.util.Scanner;

public class questao_2_fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int choice = scanner();
        ArrayList<Integer> fibo = new ArrayList<Integer>();

        System.out.println("Sequência Fibonnaci para o número " + choice);
        for (int i = 0; i < choice; i++) {
            fibo.add(a);
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;

        }

        boolean contem = fibo.contains(choice);

        if (contem) {
            System.out.println("\nO número " + choice + " pertence a sequência Fibonnaci");
        } else {
            System.out.println("\nO número " + choice + " não pertence a sequência Fibonnaci");
        }


    }

    public static int scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
