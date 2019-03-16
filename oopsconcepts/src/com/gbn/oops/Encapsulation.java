package com.gbn.oops;

 class EncapsulationDemo{
    private String empName;
    private int empAge;

    //Getter and Setter methods
   

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }
}
public class Encapsulation{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("gbn");
         obj.setEmpAge(32);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}