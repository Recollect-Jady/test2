package springExam4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="springExam4")
@PropertySource("classpath:springExam4/server.properties")
public class Appconfig {

}
