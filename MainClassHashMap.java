package HashMapExamples;

import java.util.HashMap;

public class MainClassHashMap {
	public static void main(String args[]) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"aaa");
		hm.put(2, "bbbb");
		hm.remove(1);
		//hm.clear();
		System.out.println(hm);
		/*for(Map.Entry me : hm.entrySet()) {
			System.out.println(me.getKey()+ " " +me.getValue());
		}*/
		HashMap<Student,String> hmobj = new HashMap();
		Student k = new Student("vara","Telugu");
		hmobj.put(k, "Good");
		hmobj.put(new Student("vara","Hindi"), "Good");
		System.out.println("first"+hmobj);
		hmobj.remove(k);
		System.out.println("the modified one is"+hmobj);
		Student key=new Student("leela","Hindi");
		hmobj.put(key,"Bad");
		System.out.println("second"+hmobj);
		//Student key1=new Student("vara","Telugu");
		//hmobj.remove(key1);
		System.out.println("thirdd"+hmobj);
		hmobj.remove(key);
		hmobj.put(new Student("vara1","Hindi1"), "Good");
		hmobj.remove("vara1","Hindi1");
		System.out.println("fourth"+hmobj);
		//System.out.println(hmobj.get(key));
		//if(hmobj.containsKey(key1)) {
			//hmobj.remove(key1);
		    //System.out.println("first"+hmobj);
		//}
		System.out.println("xxx"+hmobj);
	}
}
