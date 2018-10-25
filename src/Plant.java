public class Plant {

    private int hp = 100;
    private int attack = (int)(Math.random()*6)+10;


    public Plant() {
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

    public void plantAttack(Zombie zombie){
        zombie.setHp(zombie.getHp()-this.attack);
        System.out.println("The plant just struck with the power of " + getAttack() + "\nThe zombies health is now " + zombie.getHp() + " HP\n");
        attack = (int)(Math.random()*6)+10;
    }
    }

