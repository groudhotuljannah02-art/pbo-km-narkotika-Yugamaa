package util;

import java.util.Scanner;

public class InputHandler {

    public static int validasiInt(String prompt, Scanner sc) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Masukkan angka bulat (contoh: 12).");
            }
        }
    }

    public static double validasiDouble(String prompt, Scanner sc) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Masukkan angka desimal (contoh: 12.5).");
            }
        }
    }
}
