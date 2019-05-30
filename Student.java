package HashMapExamples;

public class Student {
	String name;
	String subject;
	Student(String name,String subject){
		this.name=name;
		this.subject=subject;
	}
	public String toString() {
		return name+" "+subject;
	}
}
