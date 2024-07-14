package Data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Master_Rooms {
    private Scanner in = new Scanner(System.in);
    public int Howmany;
    public boolean Exist;

    public Master_Rooms () {
        System.out.println("Does Masterrooms Exits (true,false)");
        this.Exist = in.nextBoolean();
        if (this.Exist == true) {
            System.out.println("How many Masterrooms exist?");
            this.Howmany = in.nextInt();
        }
        else {
            System.out.println("ok thank u");
        }
        }

    }
    /*
    public int AddMasterRoom() {
        boolean isValidInput = false;
        do {
            try {
                System.out.print("Does the property have master rooms? (true/false): ");
                String input = in.next();

                if (input.equalsIgnoreCase("true")) {
                    Exist = true;
                    System.out.print("How many master rooms exist? ");
                    this.Howmany = in.nextInt();
                    isValidInput = true; // Exit the loop if input is valid
                } else if (input.equalsIgnoreCase("false")) {
                    Exist = false;
                    System.out.println("Okay, there are no master rooms.");
                    isValidInput = true; // Exit the loop if input is valid
                } else {
                    System.out.println("Invalid input! Please enter true or false.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter true or false for existence and a number for count.");
                in.nextLine(); // Clear the buffer
            }
        } while (!isValidInput);
        return Howmany;
    }*/
