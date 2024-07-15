import Data.*;
import java.util.Scanner;

public class Main {
    static int maxno = 100000000;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("WELCOME TO THIS APP");
        System.out.println("----------------------------------------------------------------");
        System.out.println("CHOOSE ONE OF THE OPTIONS : ");
        System.out.println(" 1- ADD A NEW PROPERTY ");
        System.out.println(" 2- EDIT A PROPERTY ");
        System.out.println(" 3- DELETE A PROPERTY ");
        int Options = in.nextInt();
        switch (Options) {
            case 1: {
                RealEstate RealEstate[] = new RealEstate[10000];
                int i = 1;
                RealEstate[i] = new RealEstate(i);
                i++;
                int options = in.nextInt();
                break;
            }
            /*case 2: {
                this.i;
                break;
            }
            case 3: {
                RealEstate r1 = new RealEstate();
                r1.DeleteProperty();
            }
            default: {
                throw new IllegalStateException("Unexpected value: " + Options);
            }
        }*/
        }
    }
}