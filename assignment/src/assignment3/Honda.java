package assignment3;

public class Honda implements BikeSpeed {
    int speed = 60;
    //implementing methods from the interface
    @Override
    public int getSpeed() {
        return BikeSpeed.speed;
    }

    @Override
    public void manufacturingFigures() {
        System.out.println("30000 bikes are manufactured this month");

    }
}
