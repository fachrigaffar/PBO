package week8;

public class Mobil extends Roda4{
    int cc;

    public Mobil(String nama, String merk, String transmisi, String penggerak, int cc){
        super(nama,merk,transmisi,penggerak);
        this.cc = cc;
    }
    
    public int getCC(){
        return cc;
    }

    public void getCC(int cc){
        this.cc = cc;
    }

    public void printMobil(){
        System.out.println("Nama : " + super.getNama());
        System.out.println("Merk : " + super.getMerk());
        System.out.println("Transmisi : " + super.getTransmisi());
        System.out.println("Penggerak : " + super.getPenggerak());
        System.out.println("CC : " + cc);
    }
}