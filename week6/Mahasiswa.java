package week6;
import java.util.ArrayList;

public class Mahasiswa{

    private String nama, nim;
    private int semester, sks, spp, biaya;

    public Mahasiswa(String nama, String nim, int semester, int sks){
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.sks = sks;
    }

    public int setSemester(){
        if(semester<=2){
            spp = 3000000;
        }
        else if(semester>=3 && semester<=6){
            spp = 2900000;
        }
        else{
            spp=2750000;
        }
        return spp;
    }

    public int Total(){
        if(semester<=2){
            biaya = spp + (sks*300000);
        }
        else if(semester>=3 && semester<=6){
            biaya = spp + (sks*275000);
        }
        else{
            biaya = spp + (sks*250000);
        }
        return biaya;
    }

    public void getHasil(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Semester : " + semester);
        System.out.println("SKS : " + sks);
        System.out.println("SPP : " + setSemester());
        System.out.println("Biaya : " + Total());

    }
}