package week8;

public class Main{
    public static void main(String[] args){
        Motor mtr = new Motor("vario","honda","matic",125,"pertamax");
        mtr.printMotor();

        Mobil mbl = new Mobil("Brio","honda","manual","bbm",150);
        mbl.printMobil();
    }
}