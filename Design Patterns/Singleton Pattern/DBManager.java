public class DBManager {

   private static DBManager dbManager;

   private DBManager(){}

   public static DBManager getDBManager(){
	    if(dbManager == null){
            synchronized(DBManager.class){
                if(dbManager == null){
                    dbManager = new DBManager();
                }
            }
        }
      return dbManager;
   }

   public void showMessage(){
      System.out.println("welcome to Single Pattern");
   }
}