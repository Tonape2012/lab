package lab; 
//import java.util.Scanner;

class Person { //parent class
    String name;
    int age;

    Person(String name, int age) {
       this.name = name; //attribute
       this.age = age; //attribute
   }

    void speak() { //method 
       System.out.println("Hi!, My name is " + name + " and I am " + age + " years old.");
   }
}

class Student extends Person { //child class
    int grade;

    Student(String name, int age, int grade) { // Constructor for Student class
       super(name, age);//super method for accessing parent class
       this.grade = grade;
   }

    void study() { //method
       System.out.println(this.name + " with grade " + this.grade + " is studying.");
   }
}

public class Lab4_Q2 { //main class
   public static void main(String[] args) {
	  
       Student Student = new Student("Zoha", 24, 12);
       Student.speak();  // Call the speak() method of the Person class
        Student.study(); // Call the study() method of the Student class
   }
}

