package test2a;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author Administrator
 *实现类 StudentServiceImpl    
  +List<Student> findAll()
    调用 StudentDao.queryAll
 */
@Service
public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao;

	public StudentServiceImpl(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> findAll() {
		
		return studentDao.queryAll();
		
	}

}
