package week7;
import week1.Mahasiswa;

public class Main
{
    public static void main(String[] args){
        MahasiswaAktif ma = new MahasiswaAktif("A11.2022.6371","Teguh","12-05-2001",5);
        Mahasiswa m = new Mahasiswa("A11.2022.14311","Fachri","17-08-1990");
        ma.getIdentitas();
        ma.newline();
        m.getIdentitas();
    }
}
