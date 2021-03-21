
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BlackAndWhiteTV b = new BlackAndWhiteTV();
        ColourTV c = new ColourTV();
        System.out.println("Press 0 to select Black and White TV");
        System.out.println("Press 1 to select Colour TV");
        System.out.println("Enter Your selection"+"\n");
        int selection = in.nextInt();
        switch(selection) {
            case 0:
                b.selection();
                break;
            case 1:
                c.selction();
                break;
            default:
                System.out.println("Invalid Selection");
        }
    }

}
