public class Boss {
    private int health;
    private int damage;
    private String archer;

    public int getHealth(){return this.health;}
    public int getDamage(){return this.damage;}
    public String getArcher(){return this.archer;}

    public void setHealth(int health) {
        this.health = health;
    }

    public void setArcher(String archer) {
        this.archer = archer;
    }


    public void setDamage(int damage) {
        this.damage = damage;
    }
}

