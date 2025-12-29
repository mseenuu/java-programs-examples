package hirarchialInheritance;

public class Daughter extends Father {
	public void daughterExample() {
		System.out.println("how are you");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter daughter = new Daughter();
		daughter.daughterExample();
		daughter.fatherExample();
		
		

	}

}
