package responsi;

public class Student {
    String nim, nama, alamat;
    int sks,modul, spp;

    public Student(String nama, String nim, String alamat, int sks, int modul, int spp) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.sks = sks;
        this.modul = modul;
        this.spp = spp;
    }

    public int hitungPembayaran() {
        return sks * 250000 + spp;
    }

    public void getStudent() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Modul: " + modul);
        System.out.println("Jumlah SPP: " + spp);
        System.out.println("Total Pembayaran: " + hitungPembayaran());
    }
}
