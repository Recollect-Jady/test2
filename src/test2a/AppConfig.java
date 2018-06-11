package test2a;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "test2a")
@PropertySource({"classpath:jdbc.properties","classpath:test2a/App.properties"})
public class AppConfig {
	@Bean
	public DataSource dataSource(Environment env) {
		DriverManagerDataSource dd = new DriverManagerDataSource(env.getProperty("jdbc.url")// "jdbc:oracle:thin:@localhost:1521:orcl"
				, env.getProperty("jdbc.username")// "scott"
				, env.getProperty("jdbc.password") // "123456"
		);
		dd.setDriverClassName(env.getProperty("jdbc.driverClassName")// "oracle.jdbc.driver.OracleDriver"
		);
		return dd;
	}

}
