package latihanuts;

public class Perpustakaan {
    public static void main(String[] args) {
        Pustakawan p = new Pustakawan("123", "Pak Budi");
        p.inputKoleksi("Buku 1", "Penulis 1", 40);
        p.inputKoleksi("Buku 2", "Penulis 2", 10);
        p.inputAnggota("A11202214311", "Fachri Gaffar Ilhami", "085803499367");
        p.cetakListKoleksi();
        p.cetakListAnggota();
    }
}
