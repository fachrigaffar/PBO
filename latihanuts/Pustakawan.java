package latihanuts;

import java.util.*;

public class Pustakawan {
    Boolean loggedIn;
    String nip, nama;
    ArrayList<Anggota> agt = new ArrayList<Anggota>();
    ArrayList<Koleksi> kl = new ArrayList<Koleksi>();

    public Pustakawan(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
        this.loggedIn = false;
    }

    public void logIn(String nip, String nama) {
        if (this.nip.equals(nip) && this.nama.equals(nama)) {
            loggedIn = true;
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }
    }

    public void logOut() {
        loggedIn = false;
        System.out.println("Logout berhasil");
    }

    public void inputKoleksi(String judul, String penulis, int jumlah) {
        kl.add(new Koleksi(judul, penulis, jumlah));
    }

    public void inputAnggota(String kode, String nama, String kontak) {
        agt.add(new Anggota(kode, nama, kontak));
    }

    public void cetakListKoleksi() {
        for (Koleksi k : kl) {
            k.laporan();
        }
    }

    public void cetakListAnggota() {
        for (Anggota a : agt) {
            a.laporan();
        }
    }

}
