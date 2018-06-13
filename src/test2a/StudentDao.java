package test2a;

import java.util.List;

public interface StudentDao {

	List<Student> queryAll();
	
	Student findOne(Integer id);//根据id查
	
	void add(Student student);//添加
	
	void delete(Integer id);//删除
	
	void update(Student student);//修改
}
