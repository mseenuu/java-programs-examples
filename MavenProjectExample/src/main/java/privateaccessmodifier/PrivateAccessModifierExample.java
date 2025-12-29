package privateaccessmodifier;

public class PrivateAccessModifierExample {
	
	private void privateAccessModifier() {
		System.out.println("hi");
		
	}

	public static void main(String[] args) {
		PrivateAccessModifierExample privateAccessModifierExample = new PrivateAccessModifierExample();
		privateAccessModifierExample.privateAccessModifier();

	}

}
