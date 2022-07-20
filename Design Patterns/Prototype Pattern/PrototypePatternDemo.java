public class PrototypePatternDemo {
   public static void main(String[] args) {
      VehicleCache.loadCache();

      Vehicle clonedVehicle = (Vehicle) VehicleCache.getVehicle("1");
      System.out.println("Vehicle : " + clonedVehicle.getType());		

      Vehicle clonedVehicle2 = (Vehicle) VehicleCache.getVehicle("2");
      System.out.println("Vehicle : " + clonedVehicle2.getType());		

      Vehicle clonedVehicle3 = (Vehicle) VehicleCache.getVehicle("3");
      System.out.println("Vehicle : " + clonedVehicle3.getType());		
   }
}