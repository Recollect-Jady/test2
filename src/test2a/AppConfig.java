package test2a;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="test2a")
//@PropertySource("classpath:jdbc.properties")
public class AppConfig {
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dd =
				new DriverManagerDataSource("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "123456");
		dd.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		return dd;
	}
}
