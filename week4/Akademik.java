package week4;
import week1.Mahasiswa;
import java.util.*; //class input

public class Akademik{
    public static void main(String[] args){
        int n;
        System.out.println("Masukkan Jumlah Data: ");

        // buat objek dari class Scanner untuk menginput data
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        // buat variabel array dengan tipe Mahasiswa
        Mahasiswa[] mhs = new Mahasiswa[n];

        String nim;
        String nama;
        Double ipk;

        for(int i=0; i<n; i++){
            System.out.println("Data ke-"+(i+1));
            System.out.println("Masukkan NIM: ");
            nim = inp.next();
            System.out.println("Masukkan Nama: ");
            nama = inp.next();
            System.out.println("Masukkan IPK: ");
            ipk = inp.nextDouble();

            mhs[i] = new Mahasiswa(nim,nama);
        }

        for(int i=0; i<n; i++){
            System.out.println("-----------------");
            System.out.println("Data ke: "+(i+1));
            mhs[i].getIdentitas();
        }
    }
}