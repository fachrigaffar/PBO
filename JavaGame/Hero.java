package JavaGame;

public class Hero extends Karakter{
    public int exp;

    public Hero(String nama) {
        super(nama,100, 15,0);
        this.exp = 0;
    }
    
    @Override
    public int attack() {
        int attackDamage = baseAttack + (int)(Math.random() * 10); // random attack damage between baseAttack + 0-10
        return attackDamage;
    }

    @Override
    public int defend() {
        int defendDamage = 5 + (int)(Math.random() * 5);// random defend damage between 5-10
        return defendDamage;
    }

}
