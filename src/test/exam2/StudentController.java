package test.exam2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	public void list() {
		List<Student> list = studentService.findAll();
		for (Student stu : list) {
			System.out.println(String.format("%s %s %s %s %s ",
					stu.getNumber(),stu.getName(),stu.getGender(),
					stu.getAge(),stu.getMajor()));
		
		}
	}
}