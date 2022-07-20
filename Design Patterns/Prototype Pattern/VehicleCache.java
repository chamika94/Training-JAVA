import java.util.Hashtable;

public class VehicleCache {
	
   private static Hashtable<String, Vehicle> VehicleMap  = new Hashtable<String, Vehicle>();

   public static Vehicle getVehicle(String VehicleId) {
      Vehicle cachedVehicle = VehicleMap.get(VehicleId);
      return (Vehicle) cachedVehicle.clone();
   }

   
   public static void loadCache() {
      Bicycle Bicycle1 = new Bicycle();
      Bicycle1.setId("1");
      VehicleMap.put(Bicycle1.getId(),Bicycle1);

      Bus Bus1 = new Bus();
      Bus1.setId("2");
      VehicleMap.put(Bus1.getId(),Bus1);

      Car Car1 = new Car();
      Car1.setId("3");
      VehicleMap.put(Car1.getId(), Car1);
   }
}