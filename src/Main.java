public class Main {
    public static void main(String[] args) {
    Boss boss =new Boss();
    boss.setHealth(300);
    boss.setDamage(50);
    boss.setArcher("luk");
        System.out.println(" Health: " + boss.getHealth() + " Damage: "+ boss.getDamage()+" Protection: "
                +boss.getArcher());
        Hero[]heroes=reateHceroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(" Health: " + heroes[i].getHealth()+" Damage: " + heroes[i].getDamage()+" Protection: "+
                    heroes[i].getSuperpower());
        }
        }
        public static Hero[] reateHceroes(){
    Hero wars = new Hero(300,20,"protection");
    Hero Magician = new Hero(350,15);
    Hero Archer = new Hero(250,20,"Archer");
        Hero[] heroes=new Hero[3];
            for (int i = 0; i < heroes.length; i++) {
                heroes[0]=wars;
                heroes [1] = Magician;
                heroes[2]= Archer;
                }
            return heroes;
        }
    }


