package test.exam2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class StudentDaoImpl implements StudentDao{

	@Override
	public List<Student> queryAll() {
		List<Student> result = new ArrayList();
		Student stu = new Student(1, "张三", Gender.男, 18, "java");
		result.add(stu);
		
		return result;
	}

}
