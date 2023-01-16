 package com.techreturners.exercise002;

 public class Person {
     private String firstName;
     private String surname;
     private String city;
     private Integer age;

         public Person(String firstName, String surname, String city, Integer age) {
             this.firstName = firstName;
             this.surname = surname;
             this.city = city;
             this.age = age;
         }

         public String getFirstName() {
             return firstName;
         }
         public String getSurname(){
             return surname;
         }
         public String getCity() {
             return city;
         }
         public int getAge(){
             return age;
         }
 }
