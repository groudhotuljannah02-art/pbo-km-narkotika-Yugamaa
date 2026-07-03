package view;

import model.Putusan;
import util.InputHandler;

import java.util.ArrayList;
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

    public void tampilkanDaftarPutusan(ArrayList<Putusan> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("Tidak ada data untuk ditampilkan.");
            return;
        }
        System.out.println("\nNo | Nomor Perkara            | Nama Terdakwa        | Jenis        | Vonis   | Denda");
        System.out.println("---------------------------------------------------------------------------------------");
        int no = 1;
        for (Putusan p : list) {
            System.out.printf("%-2d | %-24s | %-20s | %-12s | %3d bln | Rp%,.0f%n",
                    no++, p.getNomorPerkara(), p.getNamaTerdakwa(), p.getJenisNarkotika(),
                    p.getVonisHukuman(), p.getVonisDenda());
        }
        System.out.println("Total: " + list.size() + " data");
    }

    public void tampilkanDetail(Putusan p) {
        if (p == null) {
            System.out.println("Data tidak ditemukan.");
            return;
        }
        p.tampilkan(true);
    }
}
