package week8;

public class Roda2 extends Kendaraan{
    private String transmisi;

    public Roda2(String nama, String merk, String transmisi){
        super(nama,merk);
        this.transmisi = transmisi;
    }

    public String getTransmisi(){
        return transmisi;
    }

    public void getTransmisi(String transmisi){
        this.transmisi = transmisi;
    }

    public void cekTransmisi(){
        System.out.println("Transmisi : " + transmisi);
    }
    
}