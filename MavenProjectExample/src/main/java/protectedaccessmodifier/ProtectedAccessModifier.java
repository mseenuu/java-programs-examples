package protectedaccessmodifier;

public class ProtectedAccessModifier {
	
	protected void protectedmodifier() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		ProtectedAccessModifier protectedAccessModifier = new ProtectedAccessModifier();
		protectedAccessModifier.protectedmodifier();
		// TODO Auto-generated method stub

	}

}
