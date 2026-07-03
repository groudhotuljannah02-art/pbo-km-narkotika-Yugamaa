package controller;

import model.KnowledgeRepository;
import model.Putusan;
import model.StatistikPutusan;
import util.ValidasiException;
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

            if (repository.cariByNomor(nomorPerkara) != null) {
                throw new ValidasiException("Nomor perkara sudah terdaftar!");
            }
            if (beratBarangBukti <= 0) {
                throw new ValidasiException("Berat barang bukti harus lebih dari 0!");
            }
            if (umurTerdakwa <= 0) {
                throw new ValidasiException("Umur terdakwa tidak valid!");
            }
            if (vonisHukuman < 0) {
                throw new ValidasiException("Vonis hukuman tidak boleh negatif!");
            }

            Putusan p = new Putusan(nomorPerkara, pengadilan, tanggalPutusan, namaHakim,
                    namaTerdakwa, umurTerdakwa, jenisNarkotika, beratBarangBukti,
                    pasalDilanggar, peranTerdakwa, vonisHukuman, vonisDenda);
            repository.simpan(p);
            view.tampilkanPesan("Data putusan berhasil ditambahkan. Total data: " + repository.getTotalData());
            return true;

        } catch (NumberFormatException e) {
            view.tampilkanPesan("Gagal menambah data: format angka tidak valid.");
            return false;
        } catch (ValidasiException e) {
            view.tampilkanPesan("Gagal menambah data: " + e.getMessage());
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            view.tampilkanPesan("Gagal menambah data: data tidak lengkap.");
            return false;
        }
    }

    public ArrayList<Putusan> cariPutusan(String keyword, String mode) {
        if ("nomor".equalsIgnoreCase(mode)) {
            ArrayList<Putusan> hasil = new ArrayList<>();
            Putusan p = repository.cariByNomor(keyword);
            if (p != null) {
                hasil.add(p);
            }
            return hasil;
        } else {
            return repository.cariByNama(keyword);
        }
    }

    public ArrayList<Putusan> filterPutusan(String kriteria, String nilai) {
        switch (kriteria.toLowerCase()) {
            case "jenis":
                return repository.filterByJenis(nilai);
            case "pengadilan":
                return repository.filterByPengadilan(nilai);
            default:
                return new ArrayList<>();
        }
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
