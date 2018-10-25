public class Game {

    public static void startGame() {

        System.out.println("Let the game begin!\n");

        Plant plantUno = new Plant();
        Zombie zombieUno = new Zombie();

        int whoStarts = (int)(Math.random()*2);




        while (plantUno.getHp()>0 && zombieUno.getHp()>0){
            switch(whoStarts %2){
               case 0: plantUno.plantAttack(zombieUno); whoStarts++; break;
               default: zombieUno.zombieAttack(plantUno); whoStarts++; break;
            }

        }

        if(zombieUno.getHp()<=0) {
            System.out.println("The winner is the one and only PLANT MOTHERFUCKER!! NO DOUBT!!");
        }
        else {
            System.out.println("The winner is the one and only ZOMBIE MOTHERFUCKER!! NO DOUBT!!");
        }
    }
}
