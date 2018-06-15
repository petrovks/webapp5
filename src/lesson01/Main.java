package lesson01;

/**
 * User: gkislin
 * Date: 18.06.2014
 */
public class Main {
    /**
     * First java program
     *
     * @param args : program arguments
     */
    public static void main(String[] args) {
        System.out.format("Hello %s!\n", args[0]);
        Car raceCar = new RaceCar();
        Car simpleCar = new SimpleCar();
        System.out.println(raceCar.getSpeed());
        raceCar.getDescription();
        simpleCar.getDescription();
    }
}
