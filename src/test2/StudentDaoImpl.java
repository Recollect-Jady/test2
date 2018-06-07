package test2;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

	@Override
	public List<Student> queryAll() {
		List <Student> list=new ArrayList();
		Student stu1=new Student(1,"胡佳",18,"Java工程师");
		Student stu2=new Student(2,"李思思",19,"工程师");
		Student stu3=new Student(3,"胡冰冰",16,"UI工程师");
		Student stu4=new Student(4,"王佳佳",15,"Java工程师");
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		
		return list;
		
	}

}
