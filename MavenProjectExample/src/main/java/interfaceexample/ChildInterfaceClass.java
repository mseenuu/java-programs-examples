package interfaceexample;

import multipleinheritancewithinterface.InterfaceParentOne;
import multipleinheritancewithinterface.InterfaceParentTwo;

public class ChildInterfaceClass implements InterfaceParentTwo,InterfaceParentOne {
	
	public void childinterface() {
		System.out.println("childinterface");
	}

	public static void main(String[] args) {
		
		ChildInterfaceClass childInterfaceClass = new ChildInterfaceClass();
		childInterfaceClass.childinterface();
		childInterfaceClass.interfaceparentone();
		childInterfaceClass.interfaceparenttwo();
		

	}

	@Override
	public void interfaceparentone() {
		System.out.println("interfaceone");
		
	}

	@Override
	public void interfaceparenttwo() {
		System.out.println("interfacetwo");
		
		
	}

}
