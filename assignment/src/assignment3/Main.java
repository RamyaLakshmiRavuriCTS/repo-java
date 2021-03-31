package assignment3;

public class Main {
    public static void main(String[] args) {
        //creating object for two classes
        Hero bike1 = new Hero();
        Honda bike2 = new Honda();

        bike1.manufacturingFigures();
        System.out.println("speed = "+bike1.getSpeed());

        bike2.manufacturingFigures();
        System.out.println("speed = "+bike2.getSpeed());
    }
}
