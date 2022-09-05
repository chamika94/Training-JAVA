public class Employee{
    String id;
    String code;
    String name;
    String nic;
    String address;

    Employee(String id,String code,String name,String nic,String address){
       this.id=id;
       this.code=code;
       this.name=name;
       this.nic=nic;
       this.address=address;
    }

    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    
    public void setCode(String code){
        this.code=code;
    }
    public String getCode(){
        return code;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setNic(String nic){
        this.nic=nic;
    }
    public String getNic(){
        return nic;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }

    public boolean equals(Object obj){
        Employee e = (Employee) obj;

        if(e.getCode()==this.code){
            return true;
        }else{
            return false;
        }
    }
}