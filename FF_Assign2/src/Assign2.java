
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

//Exercise 3

class A extends Marks{
	double s1;
	double s2;
	double s3;
	
	//constructor
	public A (double subject1, double subject2, double subject3) {
		s1 = subject1;
		s2 = subject2;
		s3 = subject3;
	}

	@Override
	double getPercentage() {
		
		return (s1 + s2 + s3) /3;
	}
	
}

class B extends Marks{
	double s1;
	double s2;
	double s3;
	double s4;
	
	//constructor
	public B (double subject1, double subject2, double subject3, double subject4) {
		s1 = subject1;
		s2 = subject2;
		s3 = subject3;
		s4 = subject4;
	}

	@Override
	double getPercentage() {
		
		return (s1 + s2 + s3 + s4) /4;
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
		
		//Exercise 3
		A myA = new A (8.0, 5.5, 7.2);
		System.out.println(myA.getPercentage());
		
		B myB = new B(5.0, 6.0, 7.5, 4.9);
		System.out.println(myB.getPercentage());
		

	}

}
