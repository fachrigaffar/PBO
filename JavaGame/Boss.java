package JavaGame;

public class Boss extends Karakter{
    public Boss(String nama) {
        super(nama, 200, 25, 150);
    }

    @Override
    public int attack() {
        int attackDamage = baseAttack + (int)(Math.random() * 15); // random attack damage between 0-15
        return attackDamage;
    }

    @Override
    public int defend() {
        int defendDamage = 5 + (int)(Math.random() * 5);// random defend damage between 5-10
        return defendDamage;
    }
}
