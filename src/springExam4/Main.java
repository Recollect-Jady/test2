package springExam4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Appconfig.class);
		Server server = context.getBean(Server.class);
		server.start();
	}

}
