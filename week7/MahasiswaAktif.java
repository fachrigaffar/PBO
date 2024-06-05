package week7;
import week1.Mahasiswa;

public class MahasiswaAktif extends Mahasiswa{
    public string usia;
    public int semester;

    // constructor
    public MahasiswaAktif(String nama, String nim, String tanggal_lahir, int semester){
        super(nama,nim,tanggal_lahir); //menggunakan method super karena variabel ini diambil dari Mahasiswa.week1
        this.semester = semester;
    }
    public int getSemester(){
        return semester;
    }
    // getter
    public void getIdentitas(){
        System.out.println("Nama : " + super.getNama());
        System.out.println("NIM : " + super.getNim());
        System.out.println("Tanggal Lahir : " + super.getTanggal());
        System.out.println("Semester : " + getSemester());
    }

}