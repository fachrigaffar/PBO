package week1;

public class Mahasiswa {
    String nim,nama;
    int usia;

    public void belajar(){
        System.out.println(nama + " belajar");
    }
    public void main_game(){
        System.out.println(nama + " main game");
    }
    public void getidentitas(){
        System.out.println("Nama mahasiswa : " + nama);
        System.out.println("NIM mahasiswa : " + nim);
        System.out.println("Usia mahasiswa : " + usia);
    }
}