package app;

import controller.KnowledgeController;
import model.KnowledgeRepository;
import model.Putusan;
import model.StatistikPutusan;
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
                case 6:
                    StatistikPutusan stat = controller.getStatistik();
                    view.tampilkanStatistik(stat);
                    break;
                case 0:
                    berjalan = false;
                    view.tampilkanPesan("Terima kasih! Program selesai.");
                    break;
                default:
                    view.tampilkanPesan("Menu belum tersedia / tidak dikenali.");
            }
        }
        sc.close();
    }
}
