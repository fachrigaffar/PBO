package latihanuts;

public class Koleksi {
    String judul, penulis;
    int jumlah;

    public Koleksi(String judul, String penulis, int jumlah) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah = jumlah;
    }

    public void laporan() {
        System.out.println(judul + "(" + penulis + ") : " + jumlah);
    }
}