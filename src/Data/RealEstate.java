package Data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RealEstate {
     public RealEstate(int Count) {
          System.out.println("DOne");


          
     }
     Scanner in = new Scanner(System.in);
     // Attributes
     private int UniqueID;
     private int Area;
     private int Floor;
     private double Price;
     private int Bedrooms;
     private int Bathrooms;
     private int Kitchens;
     private String Extras;
     private Garden Garden;
     private Master_Rooms master [];
     private boolean Elevator;
     private String Type;
     private boolean Furniture;
     private String Unique;
     ////////////////////////////////////

     public void AddProperty() {
//          System.out.println("Enter Area");
//          this.Area = in.nextInt();
//          System.out.println("Enter Floor");
//          this.Floor = in.nextInt();
//          System.out.println("Enter Price");
//          this.Price = in.nextDouble();
//          System.out.println("Enter Bedrooms");
//          this.Bedrooms = in.nextInt();
//          System.out.println("Enter Bathrooms");
//          this.Bathrooms = in.nextInt();
//          System.out.println("Enter Kitchens");
//          this.Kitchens = in.nextInt();
//          System.out.println("Enter Extras");
//          this.Extras = in.next();
        //  this.Garden.AddGarden();
         // System.out.print("Does the property have master rooms? (true/false): ");
          //Master_Rooms  = new Master_Rooms();
         // Master_rooms.Howmany=m1.AddMasterRoom();
          System.out.println("Does Elevator do Exist?");
          this.Elevator = in.nextBoolean();
          System.out.println("Enter type(Villa,Apartment)");
          this.Type = in.next();
          System.out.println("Does Furniture Exist?");
          this.Furniture = in.nextBoolean();
     }

public void Showinfo () {
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();

}

     public void EditProperty () {

     }

     public void DeleteProperty () {

     }

}
