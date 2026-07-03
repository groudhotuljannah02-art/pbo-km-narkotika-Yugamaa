package controller;

import model.KnowledgeRepository;
import model.Putusan;
import model.StatistikPutusan;
import view.ConsoleView;

import java.util.ArrayList;

public class KnowledgeController {

    private KnowledgeRepository repository;
    private ConsoleView view;

    public KnowledgeController(KnowledgeRepository repository, ConsoleView view) {
        this.repository = repository;
        this.view = view;
    }

    public boolean tambahPutusan(String[] data) {
        try {
            String nomorPerkara = data[0];
            String pengadilan = data[1];
            String tanggalPutusan = data[2];
            String namaHakim = data[3];
            String namaTerdakwa = data[4];
            int umurTerdakwa = Integer.parseInt(data[5]);
            String jenisNarkotika = data[6];
            double beratBarangBukti = Double.parseDouble(data[7]);
            String pasalDilanggar = data[8];
            String peranTerdakwa = data[9];
            int vonisHukuman = Integer.parseInt(data[10]);
            double vonisDenda = Double.parseDouble(data[11]);

            Putusan p = new Putusan(nomorPerkara, pengadilan, tanggalPutusan, namaHakim,
                    namaTerdakwa, umurTerdakwa, jenisNarkotika, beratBarangBukti,
                    pasalDilanggar, peranTerdakwa, vonisHukuman, vonisDenda);
            repository.simpan(p);
            view.tampilkanPesan("Data putusan berhasil ditambahkan. Total data: " + repository.getTotalData());
            return true;

        } catch (NumberFormatException e) {
            view.tampilkanPesan("Gagal menambah data: format angka tidak valid.");
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            view.tampilkanPesan("Gagal menambah data: data tidak lengkap.");
            return false;
        }
    }

    public ArrayList<Putusan> cariPutusan(String keyword, String mode) {
        return new ArrayList<>();
    }

    public ArrayList<Putusan> filterPutusan(String kriteria, String nilai) {
        return new ArrayList<>();
    }

    public boolean hapusPutusan(String nomor) {
        return false;
    }

    public StatistikPutusan getStatistik() {
        return null;
    }

    public void tampilkanSemua() {
        view.tampilkanDaftarPutusan(repository.getDaftarSemua());
    }
}
