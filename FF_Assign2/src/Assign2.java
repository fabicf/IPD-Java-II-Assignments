class Square {
	double width;
	
	public void setWidth (double enteredWidth){
		width = enteredWidth;
	}
	
	public double getArea() {
		double area = width * width;
		return area;
	}
}



public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape circle = new Shape();
		Square mySquare = new Square();
		mySquare.setWidth(5.4);
		System.out.println(mySquare.getArea());

	}

}
