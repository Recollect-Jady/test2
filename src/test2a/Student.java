package test2a;

/**
 * @author Administrator -number: Int -name: String -gender: enum(Male, Female)
 *         -age: Int -major: String +getters +构造器（初始化所有字段）
 */
public class Student {
	private int number;
	private String name;
	private Gender gender;
	private int age;
	private String major;

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getMajor() {
		return major;
	}

	public Student(int number, String name, Gender gender, int age, String major) {
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
	}

}
