package app;

import controller.KnowledgeController;
import model.KnowledgeRepository;
import model.Putusan;
import model.StatistikPutusan;
import util.InputHandler;
import util.SampleDataGenerator;
import view.ConsoleView;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsoleView view = new ConsoleView(sc);
        KnowledgeRepository repository = new KnowledgeRepository();


        ArrayList<Putusan> sample = SampleDataGenerator.generate();
        for (Putusan p : sample) {
            repository.simpan(p);
        }

        KnowledgeController controller = new KnowledgeController(repository, view);

        view.tampilkanPesan("Selamat datang! " + repository.getTotalData() + " data putusan berhasil dimuat.");

        boolean berjalan = true;
        while (berjalan) {
            int pilihan = view.tampilkanMenu();
            switch (pilihan) {
                case 1:
                    String[] data = view.inputFormPutusan(sc);
                    controller.tambahPutusan(data);
                    break;
                case 2:
                    controller.tampilkanSemua();
                    break;
                case 3:
                    handleCari(sc, view, controller);
                    break;
                case 4:
                    handleFilter(sc, view, controller);
                    break;
                case 5:
                    String nomorHapus = InputHandler.validasiString("Masukkan nomor perkara yang dihapus: ", sc);
                    controller.hapusPutusan(nomorHapus);
                    break;
                case 6:
                    StatistikPutusan stat = controller.getStatistik();
                    view.tampilkanStatistik(stat);
                    break;
                case 0:
                    berjalan = false;
                    view.tampilkanPesan("Terima kasih! Program selesai.");
                    break;
                default:
                    view.tampilkanPesan("Menu tidak dikenali.");
            }
        }
        sc.close();
    }

    private static void handleCari(Scanner sc, ConsoleView view, KnowledgeController controller) {
        System.out.println("Cari berdasarkan: 1) Nomor Perkara   2) Nama Terdakwa");
        int mode = InputHandler.validasiPilihan("Pilihan: ", 1, 2, sc);
        String keyword = InputHandler.validasiString("Kata kunci: ", sc);
        ArrayList<Putusan> hasil = controller.cariPutusan(keyword, mode == 1 ? "nomor" : "nama");
        view.tampilkanDaftarPutusan(hasil);
    }

    private static void handleFilter(Scanner sc, ConsoleView view, KnowledgeController controller) {
        System.out.println("Filter berdasarkan: 1) Jenis Narkotika   2) Pengadilan");
        int mode = InputHandler.validasiPilihan("Pilihan: ", 1, 2, sc);
        String nilai = InputHandler.validasiString("Nilai filter: ", sc);
        ArrayList<Putusan> hasil = controller.filterPutusan(mode == 1 ? "jenis" : "pengadilan", nilai);
        view.tampilkanDaftarPutusan(hasil);
    }
}
