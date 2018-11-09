public class CircleDriver {
	
	  public static void main(String[] args) {
		    
		    Circle aCircle = new Circle();
		    
		    aCircle.setColor("green");
		    aCircle.setRadius(10);
		    aCircle.display();
		    
		    Double circleArea = aCircle.computeArea();
		    Double circumference = aCircle.computeCircumference();

		    System.out.println("circle area: " + circleArea);
		    System.out.println("circle circumference: " + circumference);
		    System.out.println();
		  }

}
