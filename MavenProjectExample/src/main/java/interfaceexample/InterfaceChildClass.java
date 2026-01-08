package interfaceexample;

public class InterfaceChildClass implements InterfaceParentclass{
	
	public void childInterface() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		InterfaceChildClass interfaceChildClass = new InterfaceChildClass();
		interfaceChildClass.childInterface();
		interfaceChildClass.parentInterface();
		

	}
	@Override
	public void parentInterface() {
		System.out.println("hi obsquara");
	}

}
