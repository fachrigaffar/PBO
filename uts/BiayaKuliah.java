package uts;

public class BiayaKuliah{
    private Double biaya_gedung;
    private Double biaya_spp;
    private Double biaya_poliklinik;

    public BiayaKuliah{
        this.biaya_gedung = biaya_gedung;
        this.biaya_spp = biaya_spp;
        this.biaya_poliklinik = biaya_poliklinik;
    }

    public double getGedung(){
        return biaya_gedung;
    }
    public double getSpp(){
        return biaya_spp;
    }
    public double getPoli(){
        return biaya_poliklinik;
    }
}