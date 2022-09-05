public class EmployeeDemo{
    public static void main(String args []){

        Employee e1 = new Employee("001","A0Z","Name1","Nic1","Address1");
        Employee e2 = new Employee("002","A0x","Name2","Nic2","Address2");
        Employee e3 = new Employee("003","A0Z","Name3","Nic3","Address3");

        System.out.println("by Comparing Employee1 and Employee2");
        
        if(e1.equals(e2)){
            System.out.println("Employee's Codes are Equals..");
        }else{
            System.out.println("Employee's Codes are not Equals..");
        }
       
        System.out.println("by Comparing Employee1 and Employee3");
        
        if(e1.equals(e3)){
            System.out.println("Employee's Codes are Equals..");
        }else{
            System.out.println("Employee's Codes are not Equals..");
        }

        System.out.println("by Comparing Employee2 and Employee3");
        
        if(e2.equals(e3)){
            System.out.println("Employee's Codes are Equals..");
        }else{
            System.out.println("Employee's Codes are not Equals..");
        }       

    }
}