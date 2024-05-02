package responsi;
import java.util.Scanner;

public class InheritMain {
    public static void main(String[] args) {

        // buat objek dari class Scanner untuk menginput data
        Scanner input = new Scanner(System.in);

        String nim, nama, alamat, hobi;
        int sks,modul, spp;

            System.out.println("Masukkan Nama: ");
            nama = input.next();
            System.out.println("Masukkan NIM: ");
            nim = input.next();
            System.out.println("Masukkan Alamat: ");
            alamat = input.next();
            System.out.println("Masukkan Hobi: ");
            hobi = input.next();
            System.out.println("Masukkan jumlah SKS: ");
            sks = input.nextInt();
            System.out.println("Masukkan jumlah Modul: ");
            modul = input.nextInt();
            System.out.println("Masukkan biaya SPP: ");
            spp = input.nextInt();


        Student mhs1 = new Student(nama, nim, alamat, sks, modul, spp);
        Person ps1 = new Person(nama, nim, alamat, sks, modul, spp, hobi);
        System.out.println("\nData Mahasiswa\n");
        mhs1.getStudent();
        ps1.getHobi();
    }

}
