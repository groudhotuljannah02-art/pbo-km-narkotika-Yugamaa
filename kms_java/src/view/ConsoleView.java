package view;

import util.InputHandler;

import java.util.Scanner;

public class ConsoleView {

    private Scanner sc;

    public ConsoleView(Scanner sc) {
        this.sc = sc;
    }

    public int tampilkanMenu() {
        System.out.println("\n===== KMS PUTUSAN PENGADILAN NARKOTIKA =====");
        System.out.println("1. Tambah Putusan");
        System.out.println("2. Tampilkan Semua Putusan");
        System.out.println("3. Cari Putusan");
        System.out.println("4. Filter Putusan");
        System.out.println("5. Hapus Putusan");
        System.out.println("6. Statistik");
        System.out.println("0. Keluar");
        System.out.println("=============================================");
        return InputHandler.validasiPilihan("Pilih menu: ", 0, 6, sc);
    }

    public void tampilkanPesan(String pesan) {
        System.out.println(">> " + pesan);
    }
}
