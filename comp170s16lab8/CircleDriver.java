public class CircleDriver {

	public static void main(String[] args) {

		Circle aCircle = new Circle(5, "blue");
		aCircle.display();

		aCircle.doubleRadius();
		aCircle.display();

		Circle circle1 = new Circle(25, "purple");
		Circle circle2 = new Circle(140, "purple");
		
		if(circle1.equals(circle2)) {
			System.out.println("circle1 and circle2 are equal");
		} else {
			System.out.println("circle1 and circle2 are NOT equal");
		}
	}
}
