package model;

public class Putusan extends Perkara {

    private String namaTerdakwa;
    private int umurTerdakwa;
    private String jenisNarkotika;
    private double beratBarangBukti; // gram
    private String pasalDilanggar;
    private String peranTerdakwa;
    private int vonisHukuman; // bulan
    private double vonisDenda; // rupiah

    private static int jumlahDibuat = 0;

    public Putusan() {
        super();
        jumlahDibuat++;
    }

    public Putusan(String nomorPerkara, String pengadilan, String tanggalPutusan, String namaHakim,
                   String namaTerdakwa, int umurTerdakwa, String jenisNarkotika, double beratBarangBukti,
                   String pasalDilanggar, String peranTerdakwa, int vonisHukuman, double vonisDenda) {
        super(nomorPerkara, pengadilan, tanggalPutusan, namaHakim);
        this.namaTerdakwa = namaTerdakwa;
        this.umurTerdakwa = umurTerdakwa;
        this.jenisNarkotika = jenisNarkotika;
        this.beratBarangBukti = beratBarangBukti;
        this.pasalDilanggar = pasalDilanggar;
        this.peranTerdakwa = peranTerdakwa;
        this.vonisHukuman = vonisHukuman;
        this.vonisDenda = vonisDenda;
        jumlahDibuat++;
    }

    public String getNamaTerdakwa() {
        return namaTerdakwa;
    }

    public void setNamaTerdakwa(String namaTerdakwa) {
        this.namaTerdakwa = namaTerdakwa;
    }

    public int getUmurTerdakwa() {
        return umurTerdakwa;
    }

    public void setUmurTerdakwa(int umurTerdakwa) {
        if (umurTerdakwa < 0) {
            throw new IllegalArgumentException("Umur tidak boleh negatif");
        }
        this.umurTerdakwa = umurTerdakwa;
    }

    public String getJenisNarkotika() {
        return jenisNarkotika;
    }

    public void setJenisNarkotika(String jenisNarkotika) {
        this.jenisNarkotika = jenisNarkotika;
    }

    public double getBeratBarangBukti() {
        return beratBarangBukti;
    }

    public void setBeratBarangBukti(double beratBarangBukti) {
        if (beratBarangBukti <= 0) {
            throw new IllegalArgumentException("Berat barang bukti harus lebih dari 0");
        }
        this.beratBarangBukti = beratBarangBukti;
    }

    public String getPasalDilanggar() {
        return pasalDilanggar;
    }

    public void setPasalDilanggar(String pasalDilanggar) {
        this.pasalDilanggar = pasalDilanggar;
    }

    public String getPeranTerdakwa() {
        return peranTerdakwa;
    }

    public void setPeranTerdakwa(String peranTerdakwa) {
        this.peranTerdakwa = peranTerdakwa;
    }

    public int getVonisHukuman() {
        return vonisHukuman;
    }

    public void setVonisHukuman(int vonisHukuman) {
        if (vonisHukuman < 0) {
            throw new IllegalArgumentException("Vonis hukuman tidak boleh negatif");
        }
        this.vonisHukuman = vonisHukuman;
    }

    public double getVonisDenda() {
        return vonisDenda;
    }

    public void setVonisDenda(double vonisDenda) {
        if (vonisDenda < 0) {
            throw new IllegalArgumentException("Denda tidak boleh negatif");
        }
        this.vonisDenda = vonisDenda;
    }

    public static int getJumlahDibuat() {
        return jumlahDibuat;
    }

    @Override
    public String getKategoriHukuman() {
        // TODO: logika kategori (commit berikutnya)
        return null;
    }
}
