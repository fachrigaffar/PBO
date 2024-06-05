package week9;

public class Main{
    public static void main(String[] args){
        BangunDatar persegi = new BangunDatar(10);
        persegi.printInfo();

        System.out.println("--------------------");

        BangunDatar persegipanjang = new BangunDatar(10, 5);
        persegipanjang.printInfo();

        System.out.println("--------------------");

        BangunDatar lingkaran = new BangunDatar();
        lingkaran.setDiameter(10);
        lingkaran.printInfo();

        System.out.println("--------------------");

        BangunRuang balok = new BangunRuang(10, 5, 3);
        balok.printInfo();
    }
}