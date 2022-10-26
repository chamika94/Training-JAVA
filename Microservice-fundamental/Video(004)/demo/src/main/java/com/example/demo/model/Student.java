package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "student")
public class Student {

   @Id
   private int id;

   private String firstName;
   private String lastName;

   public void setId(int id){
      this.id = id;
   }
   public void setFirstName(String firstName){
      this.firstName = firstName;
   }

   public  void setLastName(String lastName){
      this.lastName = lastName;
   }

   public int getId() {
      return id;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }
}
