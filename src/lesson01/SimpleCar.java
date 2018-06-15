package lesson01;

/**
 * gkislin
 * 12.12.2014.
 */
public class SimpleCar extends AbstractCar{

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Something custom");
    }

    @Override
    public double getEngineVolume() {
        return 1.7;
    }
}
