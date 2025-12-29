package compiletimepolymorphism;

public class CompileTimePolymorphism {
	
	public void compilepolymorphism(int a,int b) {
		int c= a+b;
		System.out.println(c);
		
	}
	
	public void compilepolymorphism(int a,int b,int c) {
		int n= a+b+c;
		System.out.println(n);
	}
	
	public void compilepolymorphism(String h) {
		System.out.println(h);
	}

	public static void main(String[] args) {
		CompileTimePolymorphism compileTimePolymorphism = new CompileTimePolymorphism();
		compileTimePolymorphism.compilepolymorphism(1,2);
		compileTimePolymorphism.compilepolymorphism(4, 5, 6);
		compileTimePolymorphism.compilepolymorphism("obsquara");
		// TODO Auto-generated method stub

	}

}
