public class Car extends Vehicle {

   public Car(){
     type = "Car";
   }

   @Override
   public void drive() {
      System.out.println("Inside Car -> drive() method.");
   }
}