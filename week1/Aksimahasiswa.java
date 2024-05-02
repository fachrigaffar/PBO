package week1;

public class Aksimahasiswa
{
    public static void main(String[] args)
    {
        Mahasiswa mhs1 = new Mahasiswa("A11.2022.14311","Fachri","17-08-1990");
        // mhs1.nim = "A11.2022.14311";
        // mhs1.nama = "Fachri";
        // mhs1.tanggal_lahir = "17-08-1990";
        // mhs1.usia = 20;
        mhs1.getIdentitas();
        mhs1.belajar();

        // Mahasiswa mhs2 = new Mahasiswa();
        // mhs2.nim = "A12.2023.14532";
        // mhs2.nama = "Ifal";
        // mhs2.usia = 21;
        // mhs2.getIdentitas();
        // mhs2.mainGame();
    }
}