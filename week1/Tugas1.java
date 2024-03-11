package week1;

public class Tugas1 {
    String nama, kampus, kegiatan;

    public void Nama(String nama){
        System.out.println("Halo, nama saya adalah " + nama);
    }
    public void kampus(String kampus){
        System.out.println("Saya adalah mahasiswa " + kampus);
    }
    public void kegiatan(String kegiatan){
        System.out.println("Saya sedang menulis " + kegiatan);
    }

    public static void main(String[] args) {
        Tugas1 mhs1 = new Tugas1();
        mhs1.Nama("Fachri Gaffar Ilhami");
        mhs1.kampus("Teknik Informatika Universitas Dian Nuswantoro");
        mhs1.kegiatan("program java");
    }
}
