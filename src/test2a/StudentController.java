package test2a;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Administrator
 *StudentController 
  +void list()
    调用 StudentService.findAll()
    使用循环打印“学号 姓名 性别 年龄 专业”
 */
@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	public void list() {
		List<Student> list= studentService.findAll();
		for (Student student : list) {
			System.out.println(String.format("学号:%s 姓名:%s 性别:%s 年龄:%s 专业:%s",
					student.getNumber(),student.getName(),
					student.getGender(),student.getAge(),
					student.getMajor()));
		}
	}

}
