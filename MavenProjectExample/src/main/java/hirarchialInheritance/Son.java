package hirarchialInheritance;

public class Son extends Father {
	
	public void sonExample() {
		System.out.println("seenu");
	}

	public static void main(String[] args) {
		
		Son son = new Son();
		son.sonExample();
		son.fatherExample();
		
		
		// TODO Auto-generated method stub

	}

}
