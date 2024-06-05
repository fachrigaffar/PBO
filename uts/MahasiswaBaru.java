package uts;
import week1.Mahasiswa;
import java.util.ArrayList;

public class MahasiswaBaru extends Mahasiswa{
    private String progdi;
    private int potongan, tagihan;

    private ArrayList<String> nomor_pendaftaran = new ArrayList<Double>();
    private ArrayList<String> asal_sekolah = new ArrayList<Double>();
    private ArrayList<Biaya> bya = new ArrayList<Biaya>();
    // private ArrayList<Double> biaya_gedung = new ArrayList<Double>();
    // private ArrayList<Double> biaya_spp = new ArrayList<Double>();
    // private ArrayList<Double> biaya_poliklinik = new ArrayList<Double>();

    public MahasiswaBaru(){
        super(nim, nama, tanggal_lahir);
        this.progdi = progdi;
        this.potongan = potongan;

    }

    public void setUangGedung(String progdi){
        if(prgodi=="A11"){
            biaya_gedung = 30000000;
        }
        else if(progdi=="A12"){
            biaya_gedung = 30000000;
        }
        else if(progdi=="A14"){
            biaya_gedung = 27500000;
        }
        else if(progdi=="A15"){
            biaya_gedung = 25000000;
        }
        else{
            biaya_gedung = 22500000;
        }
    }

    public void setSpp(Double biaya_spp, int potongan){
        biaya_spp = 3000000;
        biaya_poliklinik = 250000;
    }

    public void total(Double biaya_gedung, Double biaya_spp, Double biaya_poliklinik){
        tagihan = biaya_gedung + biaya_spp + biaya_poliklinik;
    }

    public int tagihan(){
        tagihan = tagihan - (tagihan * potongan);
        return tagihan;
    }
    public void insertNomor(String n1){
        nomor_pendaftaran.add(n1);
    }
    public void insertAsal(String sklh1){
        asal_sekolah.add(sklh1);
    }

    public void insertBiaya(Double biaya_gedung, Double biaya_spp, Double biaya_poliklinik){
        bya.add(new Biaya(biaya_gedung, biaya_spp, biaya_poliklinik));
    }

    public void getMatkul(){ 
        for(Biaya tagihan : bya){
            System.out.println(tagihan.getGedung()+" - "+tagihan.getSpp()+" - "+tagihan.getPoli());
        }
    }
}
