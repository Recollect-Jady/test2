package test2a;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> queryAll() {
		List<Student> result =new ArrayList<>();
		result.add(new Student(1, "张三", Gender.男, 18, "java"));
		result.add(new Student(2, "李四", Gender.女, 19, "UI"));
		result.add(new Student(3, "王五", Gender.男, 20, "😄"));
		return result;
	}

}
