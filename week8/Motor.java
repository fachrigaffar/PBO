package week8;

public class Motor extends Roda2{
    int cc;
    String bahan_bakar;

    public Motor(String nama, String merk, String transmisi, int cc, String bahan_bakar){
        super(nama,merk,transmisi);
        this.cc = cc;
        this.bahan_bakar = bahan_bakar;
    }

    public void getCC(int cc){
        this.cc = cc;
    }

    public int getCC(){
        return cc;
    }
    
    public void getBahan_bakar(String bahan_bakar){
        this.bahan_bakar = bahan_bakar;
    }

    public String getBahan_bakar(){
        return bahan_bakar;
    }

    public void printMotor(){
        System.out.println("Nama : " + super.getNama());
        System.out.println("Merk : " + super.getMerk());
        System.out.println("Transmisi : " + super.getTransmisi());
        System.out.println("CC : " + cc);
        System.out.println("Bahan bakar : " + bahan_bakar);
    }

}