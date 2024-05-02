package week6;
import java.util.*;
import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        int n;
        System.out.println("Masukkan Jumlah Data: ");

        // buat objek dari class Scanner untuk menginput data
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        // buat variabel array dengan tipe Mahasiswa
        Mahasiswa[] mhs = new Mahasiswa[n];

        String nim;
        String nama;
        int sks;
        int semester;

        for(int i=0; i<n; i++){
            System.out.println("Data ke-"+(i+1));
            System.out.println("Masukkan Nama: ");
            nama = input.next();
            System.out.println("Masukkan NIM: ");
            nim = input.next();
            System.out.println("Masukkan Semester: ");
            semester = input.nextInt();
            System.out.println("Masukkan jumlah SKS: ");
            sks = input.nextInt();

            mhs[i] = new Mahasiswa(nama,nim,semester,sks);
        }

        for(int i=0; i<n; i++){
            System.out.println("-----------------");
            System.out.println("Data ke: "+(i+1));
            mhs[i].getHasil();
        }
    }
}