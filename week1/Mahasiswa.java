package week1;
import week5.Matakuliah;
import java.util.ArrayList;
import java.util.Iterator;

public class Mahasiswa{

    private String nim,nama,tanggal_lahir;
    // private int usia;
    private ArrayList<Double> nilai = new ArrayList<Double>(); //cara deklarasi arraylist
    private ArrayList<Matakuliah> mk = new ArrayList<Matakuliah>(); //cara deklarasi arraylist

    // constructor
    public Mahasiswa(String nim, String nama){
        this.nama = nama;
        this.nim = nim;
        // this.ipk = ipk;
    }
    public Mahasiswa(String nim, String nama, String tanggal_lahir){
        this.nama = nama;
        this.nim = nim;
        this.tanggal_lahir = tanggal_lahir;
        // this.ipk = ipk;
    }
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getTanggal(){
        return tanggal_lahir;
    }

    public void insertNilai(Double n1){
        nilai.add(n1);
    }

    public void insertMatkul(String matkul, String kelompok, int sks){
        mk.add(new Matakuliah(matkul, kelompok, sks));
    }

    public void belajar(){
        System.out.println(nama + " belajar");
    }
    public void mainGame(){
        System.out.println(nama + " main game");
    }

    // getter
    public void getIdentitas(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Tanggal Lahir : " + tanggal_lahir);
        getNilai();
        getMatkul();
        getMatkul2();
        // System.out.println("IPK : " + ipk);
        // System.out.println("Usia: " + usia);
    }
    // getter
    public void getNilai(){
        Iterator<Double> it = nilai.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    // Cara cetak getmatkul 1
    public void getMatkul(){ 
        System.out.println("Daftar mata kuliah: ");
        for(Matakuliah matkul : mk){
            System.out.println(matkul.getNamaMatkul()+" - "+matkul.getKelompok()+" - "+matkul.getSks());
        }
    }
    // Cara cetak getmatkul 2
    public void getMatkul2(){
        Iterator<Matakuliah> matkul = mk.iterator();
        while(matkul.hasNext()){
            Matakuliah m = matkul.next();
            System.out.println(m.getNamaMatkul()+" - "+m.getKelompok()+" - "+m.getSks());
        }
    }
    public void newline(){
        System.out.println("    ");
    }
}