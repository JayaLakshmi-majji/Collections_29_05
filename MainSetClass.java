package SetExample;

import java.util.HashSet;

public class MainSetClass {
	public static void main(String args[]) {
		HashSet<Integer> hsobj = new HashSet<>();
		hsobj.add(455);
		hsobj.add(566);
		hsobj.add(789);
		System.out.println("Set "+hsobj);
		HashSet<Price> hs = new HashSet<>();
		Price p = new Price("Mango",100);
		Price p1 = new Price("Orange",200);
		hs.add(p);
		hs.add(p1);
		System.out.println("initial set hs ="+hs);
		
		HashSet<Price> hss = new HashSet<>();
		hss.add(new Price("JackFruit",200));
		hss.add(new Price("Watermelon",200));
		System.out.println("intial hss set  "+hss);
		
		hss.addAll(hs);
		System.out.println("after adding hs to hss "+hss);
		
//		hss.retainAll(hs);
//		System.out.println("after using retain hs "+hss);
		
		hs.add(new Price("Apple",10));
		System.out.println("after adding"+hs);
		hs.remove(p);
		System.out.println("after remove"+hs);
		
		HashSet<HashSet> hss1 = new HashSet<>();
		hss1.add(hs);
		hss1.add(hss);
		System.out.println("hash settt"+hss1);
		}
}
