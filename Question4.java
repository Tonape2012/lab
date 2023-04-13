/*  Create an interface called "Person" with a method called "speak".
 *  Create two classes called "Student" and "Teacher" that implement the Person interface and implement the "speak" method. 
 * Create objects of both the Student and Teacher classes and call their respective "speak" methods.*/
package lab;
interface Person{
	void speak();

}

class Student implements Person{

	@Override
	public void speak() {
		System.out.println("This is Student class");
		
	}
	
}
class Teacher implements Person{

	@Override
	public void speak() {
		System.out.println("This is teacher class");
		
	}
	
}
public interface Question4 {
public static void main(String[] args) {
	Student s = new Student();
	s.speak();
	Teacher t = new Teacher();
	t.speak();
}
}
