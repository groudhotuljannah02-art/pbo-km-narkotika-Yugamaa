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

    public static String validasiString(String prompt, Scanner sc) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input tidak boleh kosong!");
        }
    }

    public static int validasiPilihan(String prompt, int min, int max, Scanner sc) {
        while (true) {
            int pilihan = validasiInt(prompt, sc);
            if (pilihan >= min && pilihan <= max) {
                return pilihan;
            }
            System.out.println("Pilihan harus antara " + min + " sampai " + max + "!");
        }
    }
}
