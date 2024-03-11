package week1;

public class Tugas2 {
    int diameter, alas, tinggi;

    public void lingkaran(int diameter){
        double keliling = Math.PI * diameter;
        System.out.println("Keliling lingkaran adalah " + keliling);
    }

    public void segitiga(int alas, int tinggi){
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga adalah " + luas);
    }

    public void tabung(int diameter, int tinggi){
        double volume = Math.PI * Math.pow(diameter, 2) * tinggi;
        System.out.println("Volume tabung adalah " + volume);
    }

    public static void main(String[] args) {
        Tugas2 lingkaran1 = new Tugas2();
        lingkaran1.lingkaran(10);

        Tugas2 segitiga1 = new Tugas2();
        segitiga1.segitiga(6, 8);

        Tugas2 tabung1 = new Tugas2();
        tabung1.tabung(5, 10);
    }
}
