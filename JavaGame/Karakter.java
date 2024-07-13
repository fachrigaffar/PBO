package JavaGame;

public abstract class Karakter {
    public String nama;
    public int hp, maxHp, baseAttack, damage, exp;

    public Karakter(String nama, int maxHp, int baseAttack, int exp) {
        this.nama = nama;
        this.maxHp = maxHp;
        this.hp = maxHp; // set hp to maxHp
        this.baseAttack = baseAttack;
        this.damage = 0;
        this.exp = 0;
    }

    public String getNama() {
        return nama;
    }
    
    public abstract int attack();
    public abstract int defend();

}
