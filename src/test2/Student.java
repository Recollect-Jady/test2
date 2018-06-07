package test2;

public class Student {
	private int number;
	private String name;
	private int age;
	private String major;

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getMajor() {
		return major;
	}

	public Student(int number, String name, int age, String major) {
		super();
		this.number = number;
		this.name = name;
		this.age = age;
		this.major = major;
	}

}
