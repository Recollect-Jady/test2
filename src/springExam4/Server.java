package springExam4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
@Component
public class Server {
	private String host;
	private Integer port;
	@Autowired
	public Server(Environment env) {
		host = env.getProperty("server.host");
		port = Integer.valueOf(env.getProperty("server.port"));
	}
	
		
	

	public void start() {
		System.out.println("正在启动服务器(主机:" + host + "," + "端口:" + port + ")");
		
	}

}
