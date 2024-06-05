package week10;

public class PersegiPanjang extends BangunDatar{
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
    public int hitungLuas(){
        return panjang*lebar;
    }
    public int hitungKel(){
        return 2*(panjang+lebar);
    }
    @Override
    public void luas(){
        System.out.println("Luas persegi panjang dengan panjang "+panjang+" dan lebar "+lebar+" adalah "+hitungLuas());
    }
    @Override
    public void keliling(){
        System.out.println("Keliling persegi panjang adalah "+hitungKel());
    }

}