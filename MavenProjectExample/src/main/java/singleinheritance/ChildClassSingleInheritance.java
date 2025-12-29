package singleinheritance;

public class ChildClassSingleInheritance extends SingleInheritanceParent {
	
	public void childclassMethod() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		
		ChildClassSingleInheritance child =new ChildClassSingleInheritance();
		child.childclassMethod();
		child.singleInheritanceMethod();
		
		// TODO Auto-generated method stub

	}

}
