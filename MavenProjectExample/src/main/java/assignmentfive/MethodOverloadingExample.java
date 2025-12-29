package assignmentfive;

public class MethodOverloadingExample {


	    // Average of three integers
	    static int average(int a, int b, int c) {
	        return (a + b + c) / 3;
	    }

	    // Average of three floats
	    static float average(float a, float b, float c) {
	        return (a + b + c) / 3;
	    }

	    // Area of circle
	    static double area(double radius) {
	        return 3.14 * radius * radius;
	    }

	    // Area of rectangle
	    static double area(double length, double breadth) {
	        return length * breadth;
	    }

	    // Area of square
	    static int area(int side) {
	        return side * side;
	    }

	    public static void main(String[] args) {

	        // Average
	        System.out.println("Average of integers: " + average(10, 20, 30));
	        System.out.println("Average of floats: " + average(10.5f, 20.5f, 30.5f));

	        // Areas
	        System.out.println("Area of Circle: " + area(5.0));
	        System.out.println("Area of Rectangle: " + area(10.0, 5.0));
	        System.out.println("Area of Square: " + area(4));
	    }
	}
