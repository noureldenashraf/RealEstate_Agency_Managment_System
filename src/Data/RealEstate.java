package Data;
import java.util.Scanner;
public class RealEstate {
     public RealEstate(int x) {
     this.UniqueID = String.valueOf(x);
          System.out.println("UniqueID is : "+ this.UniqueID);
          this.AddProperty();
          
     }
     Scanner in = new Scanner(System.in);
     // Attributes
     private String UniqueID;
     private int Area;
     private int Floor;
     private double Price;
     private int Bedrooms;
     private int Bathrooms;
     private int Kitchens;
     private String Extras;
     private boolean Garden;
     private int Garden_Area;
     private boolean Master_Rooms;
     private int Master_Roomsnum;
     private boolean Elevator;
     private String Type;
     private boolean Furniture;
     ////////////////////////////////////

     public void AddProperty() {
          System.out.println("Enter Area");
          this.Area = in.nextInt();
          System.out.println("Enter Floor");
          this.Floor = in.nextInt();
          System.out.println("Enter Price");
          this.Price = in.nextDouble();
          System.out.println("Enter Bedrooms");
          this.Bedrooms = in.nextInt();
          System.out.println("Enter Bathrooms");
          this.Bathrooms = in.nextInt();
          System.out.println("Enter Kitchens");
          this.Kitchens = in.nextInt();
          System.out.println("Enter Extras");
          this.Extras = in.next();
          System.out.println("is there a Garden (true/false) : ");
          this.Garden = in.nextBoolean();
          if (this.Garden == true) {
               System.out.println("What is the Garden Area?");
               this.Garden_Area = in.nextInt();
          }
          System.out.print("Does the property have master rooms? (true/false): ");
          this.Master_Rooms = in.nextBoolean();
          if (this.Master_Rooms == true) {
               System.out.println("How Many Master rooms do Exist?");
               this.Master_Roomsnum = in.nextInt();
          }
          System.out.println("Does Elevator do Exist? (true/false): ");
          this.Elevator = in.nextBoolean();
          System.out.println("Enter type(Villa,Apartment)");
          this.Type = in.next();
          System.out.println("Does Furniture Exist? (true/false): ");
          this.Furniture = in.nextBoolean();
     }

public void Showinfo () {
     System.out.println("UniqueID is : " + this.UniqueID);
     System.out.println("Area is : " + this.Area);
     System.out.println("Garden Area = : " + this.Garden_Area);
     System.out.println("Bathrooms count : " + this.Bathrooms);
     System.out.println("Bedrooms count : " + this.Bedrooms);
     System.out.println("Elevator : " + this.Elevator);
     System.out.println("Extras are : " + this.Extras);
     System.out.println("The Floor is : " + this.Floor);
     System.out.println("Furniture :" + this.Furniture);
     System.out.println("Type is : " + this.Type);
     System.out.println("Master rooms Count is : " + this.Master_Roomsnum);
     System.out.println("Price is : " + this.Price);
     System.out.println("Kitchens Count : " + this.Kitchens);

}

     public void EditProperty () {

     }

     public void DeleteProperty () {

     }

}
