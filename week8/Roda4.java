package week8;

public class Roda4 extends Kendaraan{
    private String transmisi, penggerak;

    public Roda4(String nama, String merk, String transmisi, String penggerak){
        super(nama,merk);
        this.transmisi = transmisi;
        this.penggerak = penggerak;
    }

    public String getTransmisi(){
        return transmisi;
    }

    public String getPenggerak(){
        return penggerak;
    }
    public void getTransmisi(String transmisi){
        this.transmisi = transmisi;
    }


    public void getPenggerak(String penggerak){
        this.penggerak = penggerak;
    }

    public void cekRoda4(){
        System.out.println("Transmisi : " + transmisi);
        System.out.println("Penggerak : " + penggerak);
    }


}