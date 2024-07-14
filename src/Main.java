import Data.Master_Rooms;
import Data.RealEstate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int Addnew;
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
                RealEstate PropertyID [] = new RealEstate[Addnew];
                for (int i = 100; i < Addnew; Addnew++) {
                    PropertyID [Addnew] = new RealEstate(Addnew);
                }
               // int recount;
              //  System.out.println("How many Properties u wanna add ?");
               // recount = in.nextInt();
            /*   Master_Rooms[] master = new Master_Rooms[recount];
                for (int i = 0; i < recount; i++) {
                    master[i] = new Master_Rooms(i);
                }*/
               // PropertyID = new RealEstate[ItemsCount+1];


                }
            }
      /*  for (int i = 0; i < lo; i++) {
            System.out.println("ENTER UNIQUE PROPERTY ID");

            Master_Rooms Unique = new Master_Rooms();
            RealEstate r1 = new RealEstate();
            r1.AddProperty();
        }
        break;}
    case 2:{
        RealEstate r1 = new RealEstate();
        r1.EditProperty();
        break;}
    case 3:{
        RealEstate r1 = new RealEstate();
        r1.DeleteProperty();}
    default:{
        throw new IllegalStateException("Unexpected value: " + Options);}*/
        }
    }