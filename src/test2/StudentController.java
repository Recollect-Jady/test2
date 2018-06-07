package test2;

import java.util.List;

public class StudentController {
	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	public void list() {
		
		List<Student> list=studentService.findAll();
		
		for(Student stu:list) {
			System.out.println(String.format("%s %s %s %s",
					stu.getNumber(),stu.getName(),
					stu.getAge(),stu.getMajor()));
		}
		
		
		
		
	}
}
