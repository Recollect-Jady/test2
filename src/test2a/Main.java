package test2a;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentController studentController = context.getBean(StudentController.class);
		studentController.list();
		System.out.println("------------findone------------");
		StudentDao studentDao = context.getBean(StudentDao.class);
		System.out.println(studentDao.findOne(3));
		System.out.println("------------add------------");
		studentDao.add(new Student(6, "小哥", Gender.男, 18, "工程", 5));
		System.out.println("------------删除------------");
		studentDao.delete(1);
		System.out.println("------------修改------------");
		studentDao.update(new Student(0, "赵七", Gender.男, 22, "java", 4));
		/*
		 * Environment env = context.getBean(Environment.class); String str =
		 * env.getProperty("app.hehe"); String str1 = env.getProperty("app.Config");
		 * System.out.println(str+","+str1);
		 */
	}

}
