package JavaGame;

public class Mob extends Karakter{

    public Mob(String nama) {
        super(nama, 50, 10, 50);
    }

    @Override
    public int attack() {
        int attackDamage = baseAttack + (int)(Math.random() * 5); // random attack damage between baseAttack + 0-5
        return attackDamage;
    }

    @Override
    public int defend() {
        int defendDamage = 3 + (int)(Math.random() * 3);// random defend damage between 3-6
        return defendDamage;
    }
}
