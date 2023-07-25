package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Masukan Nilai N : ");
            Integer N = scanner.nextInt();
            if (N < 3) {
                System.out.println("Nilai N terlalu kecil");
            } else if (N > 9) {
                System.out.println("Nilai N terlalu besar");
            } else {
                String top = "=".repeat(N);
                String middle = "| "+" || ".repeat(N-3) +"|";
                String bottom = "=".repeat(N);
                System.out.println(top + middle + bottom);
                break;
            }
        }
    }
}