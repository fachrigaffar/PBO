package responsi;

public class Person extends Student{
    String hobi;

    public Person(String nama, String nim, String alamat, int sks, int modul, int spp, String hobi) {
        super(nama, nim, alamat, sks, modul, spp);
        this.hobi = hobi;
    }

    public void getHobi() {
        System.out.println("Hobi: " + hobi);
    }
    
}
