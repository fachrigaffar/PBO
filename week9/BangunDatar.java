package week9;

public class BangunDatar{
    private int panjang;
    private int lebar;
    private int diameter;
    private int sisi;
    private static final double pi = 3.14;

    public BangunDatar(int sisi){
        this.sisi = sisi;
    }
    public BangunDatar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public BangunDatar(){
        this.diameter = diameter;
    }
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
    public int getSisi(){
        return sisi;
    }
    public int getDiameter(){
        return diameter;
    }
    public int luas(int sisi){
        return sisi * sisi;
    }
    public void setDiameter(int diameter){
        this.diameter = diameter;
    }
    public int luas(int panjang, int lebar){
        return panjang * lebar;
    }
    public int luas(int diameter, double pi){
        return (int) (pi * diameter * diameter / 4);
    }
    public void printInfo(){
        if(sisi != 0)
            System.out.println("Luas Persegi: " + luas(sisi));
        if(panjang != 0 && lebar != 0)
            System.out.println("Luas Persegi Panjang: " + luas(panjang, lebar));
        if(diameter != 0)
            System.out.println("Luas Lingkaran: " + luas(diameter, pi));
    }
    
}