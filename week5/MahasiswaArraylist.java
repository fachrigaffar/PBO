package week5;
import week1.Mahasiswa;
import java.util.*;

public class MahasiswaArraylist{
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa("Fachri","14311");
        mhs.insertNilai(65.0);
        mhs.insertNilai(72.4);
        mhs.insertNilai(87.5);
        mhs.insertNilai(90.0);
        mhs.insertNilai(100.0);
        mhs.insertMatkul("Kalkulus","4208",4);
        mhs.insertMatkul("PBO","4303",4);
        mhs.insertMatkul("ALPRO","4211",3);
        mhs.getIdentitas();
    }
}