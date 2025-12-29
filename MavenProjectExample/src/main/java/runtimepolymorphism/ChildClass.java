package runtimepolymorphism;

public class ChildClass extends ParentClass {
	
	public void addition(int a, int b) {
		super.addition(1,2);
		int n=a-b;
		System.out.println(n);
	}
	

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.addition(2,3);
		
		//upcasting
		ParentClass parentClass = new ChildClass();
		parentClass.addition(6, 5);
		// TODO Auto-generated method stub

	}

}
