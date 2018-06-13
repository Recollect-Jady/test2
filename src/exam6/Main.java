package exam6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		OperatorDao operatorDao = context.getBean(OperatorDao.class);
		System.out.println(operatorDao.findAll());
		System.out.println(operatorDao.findOne(2));
		//operatorDao.create("王五", "123", "HRR");
		//operatorDao.updatePassword(1, "456");
		//operatorDao.delete(3);
		//operatorDao.disable(2);
		operatorDao.enable(2);
	}

}
