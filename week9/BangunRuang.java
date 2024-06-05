package week9;

public class BangunRuang extends BangunDatar{
    private int tinggi;

    public BangunRuang(int panjang, int lebar, int tinggi){
        super(panjang,lebar);
        this.tinggi = tinggi;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int volume(){
        return tinggi*super.getPanjang()*super.getLebar();
    }
    public void printInfo(){
        System.out.println("Panjang Balok: " + super.getPanjang());
        System.out.println("Lebar Balok: " + super.getLebar());
        System.out.println("Tinggi Balok: " + tinggi);
        System.out.println("Volume Balok: " + volume());
    }

    
}