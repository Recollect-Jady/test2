package test2;

import java.util.List;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao studentdao;
	public StudentServiceImpl(StudentDao studentdao) {
		this.studentdao = studentdao;
	}
	@Override
	public List<Student> findAll() {
		return studentdao.queryAll();
		
	}

	
		
		
	
}
