package latihanuts;

public class Anggota {
    String kode, nama, kontak;

    public Anggota(String kode, String nama, String kontak) {
        this.kode = kode;
        this.nama = nama;
        this.kontak = kontak;
    }

    public void laporan()
   {
    System.out.println("["+kode+"] "+nama+" ("+kontak+")");
   }
}
