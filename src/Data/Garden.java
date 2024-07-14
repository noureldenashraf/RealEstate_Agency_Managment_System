package Data;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Garden {
    public Scanner in = new Scanner(System.in);
    protected int Area;
    protected boolean Exist;

     public void AddGarden () {
         do {
             try {
                System.out.print("Does the property have a Garden?");

                if (this.Exist == true) {
                    System.out.println("What is the Area?");
                    this.Area = in.nextInt();
                } else if (this.Exist == false) {
                    System.out.println("Ok There is no Garden");
                }

            } catch (InputMismatchException in) {
                System.out.println("Invalid input!");
            }
        } while (true);
     }
}
