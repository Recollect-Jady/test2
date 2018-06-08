package test.exam1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*UserDao ud =new UserDao();
		UserService us =new UserService(ud);
		UserController uc =new UserController(us);
		uc.register("胡佳", "a123");*/
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("test/exam1/beans.xml");
		UserController userController =context.getBean(UserController.class);
		userController.register("胡佳", "123");
	}

}
