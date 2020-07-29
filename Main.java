/*
 *  Builder design pattern
 */

public class Main {

    public static void main(String[] args) {

        // Smart bomb
        BombBuildDirector director = new BombBuildDirector();
        BombBuilder builder = new SmartBombBuilder();
        director.setBombBuilder(builder);
        director.createBomb();
        Bomb bomb = director.getBomb();
        System.out.println(bomb);

        // Dropping bomb
        builder = new DroppingBombBuilder();
        director.setBombBuilder(builder);
        director.createBomb();
        bomb = director.getBomb();
        System.out.println(bomb);

        // Random bomb
        builder = new RandomBombBuilder();
        director.setBombBuilder(builder);
        for (int i = 0; i < 5; i++) {
            director.createBomb();
            bomb = director.getBomb();
            System.out.println(bomb);
        }

    }

}
