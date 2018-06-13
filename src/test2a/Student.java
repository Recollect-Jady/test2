package test2a;

/**
 * @author Administrator -number: Int -name: String -gender: enum(Male, Female)
 *         -age: Int -major: String +getters +构造器（初始化所有字段）
 */
public class Student {
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", gender=" + gender + ", age=" + age + ", major="
				+ major + ", id=" + id + "]";
	}

	private int number;
	private String name;
	private Gender gender;
	private int age;
	private String major;
	private int id;

	public Student(int number, String name, Gender gender, int age, String major, int id) {
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
