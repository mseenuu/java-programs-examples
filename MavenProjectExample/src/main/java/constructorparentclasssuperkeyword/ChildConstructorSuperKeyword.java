package constructorparentclasssuperkeyword;

public class ChildConstructorSuperKeyword extends ConstructorSuperKeywordParent{
	
	public ChildConstructorSuperKeyword() {
		super();
		System.out.println("obsquara");
		
	}

	public static void main(String[] args) {
		ChildConstructorSuperKeyword childConstructorSuperKeyword = new ChildConstructorSuperKeyword();
		
		

	}

}
