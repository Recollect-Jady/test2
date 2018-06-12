package test2a;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNumber) throws SQLException {
		int number = rs.getInt(1);
		String name = rs.getString(2);
		Gender gender = Gender.valueOf(rs.getString(3));
		int age = rs.getInt(4);
		String major = rs.getString(5);
		int id = rs.getInt(6);
		Student s = new Student(number, name, gender, age, major, id);
		return s;
	}

}
