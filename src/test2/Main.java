package test2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("test2/beans.xml");
		StudentController studentController= context.getBean(StudentController.class);
		studentController.list();
	}

}
