package encapsulationexample;

public class Encapsulation {
	
	private int id;
	private String name;
	
	public void setter(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void getter() {
		System.out.println(id);
		System.out.println(name);
	}

}
