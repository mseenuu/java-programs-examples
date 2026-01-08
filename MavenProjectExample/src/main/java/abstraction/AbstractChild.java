package abstraction;

public class AbstractChild extends AbstractParent{
	
	public void childabstractmethod() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		AbstractChild abstractChild = new AbstractChild();
		abstractChild.abstractInstantMethod();
		abstractChild.abstractMethod();
		abstractChild.childabstractmethod();
		

	}

	@Override
	public void abstractMethod() {
		System.out.println("abstract");
		// TODO Auto-generated method stub
		
	}

}
