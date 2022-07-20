public class Bicycle extends Vehicle {

   public Bicycle(){
     type = "Bicycle";
   }

   @Override
   public void drive() {
      System.out.println("Inside Bicycle -> drive() method.");
   }
}