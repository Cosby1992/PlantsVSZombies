public class Zombie {

    private int hp = 100;
    private int attack = (int)(Math.random()*6)+10;

    public Zombie() {
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }


    public void zombieAttack(Plant plant){
        plant.setHp(plant.getHp()-this.attack);
        System.out.println("The zombie just struck with the power of " + getAttack() + "\nThe plants health is now " + plant.getHp() + " HP\n");
        attack = (int)(Math.random()*6)+10;
    }
}
