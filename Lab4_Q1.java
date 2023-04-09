package lab;
//import java.util.Scanner;
class Vehicle { //parent class
    String brand;  //attributes 
    String model;  //attributes 
    int year;		//attributes 

    Vehicle(String brand, String model, int year) {
       this.brand = brand;
       this.model = model;
       this.year = year;
   }

    void drive() { //method called
       System.out.println(this.brand + " " + this.model + " " + this.year+" is running");
   }
}

class Car extends Vehicle { //child class inherits from Vehicle
    String color; //additional attribute

   Car(String brand, String model, int year, String color) {
       super(brand, model, year);
       this.color = color;
   }

   public void honk() { //method called
       System.out.println(this.brand + " " + this.model +" "+ this.year+" is honking");
   }
}

public class Lab4_Q1 {
   public static void main(String[] args) {
	   //Scanner sc=new Scanner(System.in);
       Car Car = new Car("Ferrari", "Roma", 2020, "Black"); 
       System.out.println("-----Car Details-----");
       System.out.println("Brand:"+Car.brand);
       System.out.println("Model:"+Car.model);
       System.out.println("Year :"+Car.year);
       System.out.println("Color:"+Car.color);
       //Create an object
       
       Car.drive();
       Car.honk();
   }
}

