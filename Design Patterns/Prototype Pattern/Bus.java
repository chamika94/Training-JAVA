public class Bus extends Vehicle {

   public Bus(){
     type = "Bus";
   }

   @Override
   public void drive() {
      System.out.println("Inside Bus -> drive() method.");
   }
}