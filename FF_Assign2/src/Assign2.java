
//Exercise 1
//without abstract class
/*class Square {
	double length;
	
	//constructor:
	public Square (double enteredWidth) {
		length = enteredWidth;
	}
	//without constructor:
	public void setWidth (double enteredWidth){
		width = enteredWidth;
	}
	
	public double getArea() {
		double area = length * length;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = length * 4;
		return perimeter;
	}
}*/

//with abstract class

class Square extends Shape{

	
	double getArea(double length) {
		double area = length * length;
		return area;
	}

	
	double getPerimeter(double length) {
		double perimeter = length * 4;
		return perimeter;
	}
	
}


//Exercise 2
class Dog extends Animals{

	@Override
	String sound() {
		return "woof";
	}
	
	
	
}
class Cat extends Animals{

	@Override
	String sound() {
		return "meow";
	}
	
	
	
}

public class Assign2 {

	public static void main(String[] args) {
		//Exercise 1
		//with constructor:
		Square mySquare = new Square();
							
		//mySquare.setWidth(5.4); //without constructor
		System.out.println(mySquare.getArea(5.4));
		
		
		//Exercise 2
		Dog myDog = new Dog();
		System.out.println(myDog.sound());
		
		Cat myCat = new Cat();
		System.out.println(myCat.sound());

	}

}
