package com.bilgee.demo.model;

public class Student {
    // public variables for name and age
    public String name;
    public int age;


    //Constructor for name and age
    public Student(String name, int  age) {
        this.name = name;
        this.age = age;
    }




    /*
    TODO
        doubleMyAge
        argument: age
        multiply * 2
        call method from Main
     */
    // New method doubleMyAge
   public int studentMultipleAgeByTwo(int age ){
       int sum = 0;
       sum = age * 2;
       return sum;
   }
   public int teachardoubleMyAge(int age){

       return age * 2 ;
   }
   public int bonusDoubleMyAge(){
    return this.age * 2;
   }







}
