package model;

public abstract class Perkara {

    private String nomorPerkara;
    private String pengadilan;
    private String tanggalPutusan;
    private String namaHakim;

    public Perkara() {
    }

    public Perkara(String nomorPerkara, String pengadilan, String tanggalPutusan, String namaHakim) {
        this.nomorPerkara = nomorPerkara;
        this.pengadilan = pengadilan;
        this.tanggalPutusan = tanggalPutusan;
        this.namaHakim = namaHakim;
    }

    public String getNomorPerkara() {
        return nomorPerkara;
    }

    public void setNomorPerkara(String nomorPerkara) {
        this.nomorPerkara = nomorPerkara;
    }

    public String getPengadilan() {
        return pengadilan;
    }

    public void setPengadilan(String pengadilan) {
        this.pengadilan = pengadilan;
    }

    public String getTanggalPutusan() {
        return tanggalPutusan;
    }

    public void setTanggalPutusan(String tanggalPutusan) {
        this.tanggalPutusan = tanggalPutusan;
    }

    public String getNamaHakim() {
        return namaHakim;
    }

    public void setNamaHakim(String namaHakim) {
        this.namaHakim = namaHakim;
    }

    /**
     * Method abstrak: setiap jenis perkara wajib mendefinisikan
     * kategori hukumannya sendiri (mendukung polimorfisme).
     */
    public abstract String getKategoriHukuman();
}

