package week10;

public class Segitiga extends BangunDatar{
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public int getAlas(){
        return alas;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int hitungLuas(){
        return (alas*tinggi)/2;
    }
    @Override
    public void luas(){
        System.out.println("Luas segitiga adalah "+hitungLuas());
    }
    @Override
    public void keliling(){
        System.out.println("keliling segitiga adalah ");
    }
}