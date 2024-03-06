package week1;

public class Aksimahasiswa {
    public static void main(String[]args)
    {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "A11.2022.14311";
        mhs1.nama = "Fachri Gaffar Ilhami";
        mhs1.usia = 20;
        mhs1.getidentitas();
        mhs1.belajar();
        mhs1.main_game();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "A11.2021.14366";
        mhs2.nama = "Nusrul Abdula Zakariya Imran";
        mhs2.usia = 21;
        mhs2.getidentitas();
        mhs2.belajar();
        mhs2.main_game();
    }
}
