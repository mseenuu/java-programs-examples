package collection;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
	
	

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		System.out.println(l);
		
		System.out.println(l.get(1));
		
		l.set(2, 5);
		System.out.println(l);
		
		System.out.println(l.size());
		
		System.out.println(l.isEmpty());
		
		l.remove(3);
		System.out.println(l);
		
		System.out.println(l.contains(6));
		
		System.out.println(l.indexOf(5));
		
		System.out.println(l.lastIndexOf(5));

	}

}
