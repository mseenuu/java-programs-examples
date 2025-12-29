package parentclassmethodsuperkeyword;

public class SuperParentClassMethodChild extends ParentMethodSuperKeyword{
	
	public void parentMethod() {
		System.out.println("Child Class Method");
		super.parentMethod();
	}

	public static void main(String[] args) {
		SuperParentClassMethodChild superParentClassMethodChild = new SuperParentClassMethodChild();
		superParentClassMethodChild.parentMethod();
		

	}

}
