package inheritance;

public class Inheritance3ParameterizedConstructor {
	public static void main(String[] args) {
		int x=5;
		String name="Ram";
		Student s1 = new Student(x, name);
	}

}

class Person {
	int age;
	String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	/*
	 * @Override public boolean equals(Object obj) { boolean status=false; if(obj
	 * instanceof Person) { Person p=(Person)obj; if(age==p.age &&
	 * name.equals(p.name)) { status=true; } } return status; }
	 */
}

class Student extends Person {

	public Student(int age, String name) {
		super(age, name);// commenting this line will produce error
		System.out.println("Inside Student");
	}

}