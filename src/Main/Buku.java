package Main;
//nambah comment dwiki

public class Buku {// variable dari buku
    String kodeBuku;
    String judul;
    int jumlahHalaman;
    String penulis;
    String kategory;
    String daftarIsi;
    String penerbit;
    int harga;
    String daftarPustaka;
    String covered;

    //contractor ->
    public Buku() {

    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getKategory() {
        return kategory;
    }

    public void setKategory(String kategory) {
        this.kategory = kategory;
    }

    public String getDaftarIsi() {
        return daftarIsi;
    }

    public void setDaftarIsi(String daftarIsi) {
        this.daftarIsi = daftarIsi;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getDaftarPustaka() {
        return daftarPustaka;
    }

    public void setDaftarPustaka(String daftarPustaka) {
        this.daftarPustaka = daftarPustaka;
    }

    public String getCovered() {
        return covered;
    }

    public void setCovered(String covered) {
        this.covered = covered;
    }

    public Buku (String kodeBuku, String judul, int jumlahHalaman, String penulis, String kategory, String daftarIsi, String penerbit, int harga, String daftarPustaka, String covered) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.jumlahHalaman = jumlahHalaman;
        this.penulis = penulis;
        this.kategory = kategory;
        this.daftarIsi = daftarIsi;
        this.penerbit = penerbit;
        this.harga = harga;
        this.daftarPustaka = daftarPustaka;
        this.covered = covered;

    }
}
