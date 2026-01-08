package collection;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		
		Set<Integer> s= new HashSet<Integer>();
		
		Set<Integer> x = new HashSet<Integer>();
		
		s.add(1);
		s.add(2);
		s.add(3);
		
		x.add(4);
		x.add(5);
		x.add(6);
		
		System.out.println(s);
		System.out.println(x);
		
		s.addAll(x);
		System.out.println(s);
		
		System.out.println(s.size());
		System.out.println(x.size());
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.contains(2));
		
		System.out.println(s.containsAll(x));
		System.out.println(x.containsAll(s));
		
		s.remove(3);
		System.out.println(s);
		
		s.removeAll(x);
		System.out.println(s);
		
		s.clear();
		System.out.println(s);
		
		
		
		
		
		
		
		

	}

}
