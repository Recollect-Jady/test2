package exam6;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@ComponentScan(basePackages="exam6")
@PropertySource("classpath:exam6/jdbc.properties")
public class AppConfig {
	@Bean//数据源依赖DataSource配置环境
	public DataSource dataSource(Environment env) {
		DriverManagerDataSource dd = 
				new DriverManagerDataSource(env.getProperty("jdbc.url"),
						env.getProperty("jdbc.username"),
						env.getProperty("jdbc.password")
				);
		dd.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		return dd;
		
	}
	@Bean//JdbcTemplate依赖DataSource
	public JdbcTemplate jdbcTemplate (DataSource ds) {
		return new JdbcTemplate(ds);
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(15);
	}
	
}
