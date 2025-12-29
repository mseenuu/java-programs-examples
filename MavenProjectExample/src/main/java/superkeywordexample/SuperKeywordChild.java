package superkeywordexample;

public class SuperKeywordChild extends SuperKeywordExample{
	
	int i =20;
	
	public void superkeyword() {
		System.out.println(i);
		System.out.println(super.i);
	}
	

	public static void main(String[] args) {
		SuperKeywordChild superKeywordChild = new SuperKeywordChild();
		superKeywordChild.superkeyword();

	}

}
