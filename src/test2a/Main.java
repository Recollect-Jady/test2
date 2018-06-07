package test2a;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		StudentController studentController=context.getBean(StudentController.class);
		studentController.list();
	}

}
