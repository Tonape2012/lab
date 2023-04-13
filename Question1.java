/* Q.1 Create an abstract class called "Shape" with an abstract method called "calculateArea".
 *  Create two subclasses called "Circle" and "Rectangle" that inherit from Shape and implement the "calculateArea" method. 
 * Create objects of both the Circle and Rectangle classes and call their respective "calculateArea" methods.*/

package lab;

abstract class Shape{
	 abstract void calculateArea();
			
}

class Circle extends Shape
{ 

	@Override
	void calculateArea() 
	{
		int radius=5;
	double area= ((radius*radius)*3.14);;
		
		System.out.println("Area of circle is:- "+area);
		
	}}
	
class Rectangle extends Shape
{

	@Override
	void calculateArea() {
		int lenght=5,width=8;
		int area=lenght*width;
		System.out.println("Area of Rectangle is:-"+area);	
	}}
	
public class Question1 {

	public static void main(String[] args) {
		Circle c= new Circle();
		c.calculateArea();
		Rectangle r = new Rectangle();
		r.calculateArea();
	}

}
