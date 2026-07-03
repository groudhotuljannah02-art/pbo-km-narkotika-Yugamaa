package util;

import model.Putusan;

import java.util.ArrayList;

public class SampleDataGenerator {

    public static ArrayList<Putusan> generate() {
        ArrayList<Putusan> data = new ArrayList<>();

        String[] namaDepan = {"Andi", "Budi", "Citra", "Dedi", "Eka", "Fajar", "Gita", "Hendra", "Indra", "Joko",
                "Kiki", "Lina", "Made", "Nanda", "Oki", "Putri", "Rian", "Sari", "Tono", "Umar",
                "Vina", "Wawan", "Yanti", "Zaki", "Bayu"};
        String[] namaBelakang = {"Saputra", "Wijaya", "Kurniawan", "Pratama", "Santoso", "Hidayat", "Setiawan",
                "Gunawan", "Susanto", "Wibowo"};
        String[] jenisNarkotika = {"Sabu-sabu", "Ganja", "Ekstasi", "Heroin", "Kokain"};
        String[] pengadilan = {"PN Surabaya", "PN Malang", "PN Sidoarjo", "PN Jakarta Selatan", "PN Medan"};
        String[] pasal = {"Pasal 114 ayat (1) UU No. 35/2009", "Pasal 112 ayat (1) UU No. 35/2009",
                "Pasal 111 ayat (1) UU No. 35/2009", "Pasal 127 ayat (1) UU No. 35/2009"};
        String[] peran = {"Bandar", "Kurir", "Pengguna", "Penyimpan", "Pengedar"};
        String[] hakim = {"Hj. Sri Wahyuni, S.H., M.H.", "Ahmad Fauzi, S.H., M.H.", "Dewi Lestari, S.H.",
                "Bambang Sutrisno, S.H., M.H.", "Rina Marlina, S.H."};

        for (int i = 1; i <= 55; i++) {
            String kodePn = (i % 5 == 0) ? "Mlg" : "Sby";
            String nomor = (1000 + i) + "/Pid.Sus/2025/PN" + kodePn;
            String nama = namaDepan[i % namaDepan.length] + " " + namaBelakang[i % namaBelakang.length];
            int umur = 19 + (i % 35);
            String jenis = jenisNarkotika[i % jenisNarkotika.length];
            double berat = 0.5 + (i % 20) * 1.25;
            String pasalP = pasal[i % pasal.length];
            String peranP = peran[i % peran.length];
            int vonis = 6 + (i % 10) * 8;
            double denda = 500_000_000 + (i % 5) * 300_000_000;
            String pn = pengadilan[i % pengadilan.length];
            String tanggal = (10 + (i % 18)) + "-0" + (1 + (i % 6)) + "-2025";
            String namaHakim = hakim[i % hakim.length];

            data.add(new Putusan(nomor, pn, tanggal, namaHakim, nama, umur, jenis, berat,
                    pasalP, peranP, vonis, denda));
        }
        return data;
    }
}