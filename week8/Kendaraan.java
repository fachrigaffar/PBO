package week8;

public class Kendaraan{
    private String nama, merk;

    public Kendaraan(String nama, String merk){
        this.nama = nama;
        this.merk = merk;
    }
    
    public String getNama(){
        return nama;
    }

    public String getMerk(){
        return merk;
    }

    public void getNama(String nama){
        this.nama = nama;
    }

    public void getMerk(String merk){
        this.merk = merk;
    }

    public void printKendaraan(){
        System.out.println("Nama : " + nama);
        System.out.println("Merk : " + merk);
    }
}