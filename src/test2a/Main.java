package test2a;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		StudentController studentController=context.getBean(StudentController.class);
		studentController.list();
		
		
		Environment env = context.getBean(Environment.class);
		String str = env.getProperty("app.hehe");
		String str1 = env.getProperty("app.Config");
		System.out.println(str+","+str1);
	}

}
