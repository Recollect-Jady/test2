package test2a;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private DataSource dataSource;
	
	public StudentDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Student> queryAll() {
		List<Student> result =new ArrayList<>();
		Connection cnt = null;
		try {
			cnt = dataSource.getConnection();
			PreparedStatement ps = cnt.prepareStatement
					("select S_NUMBER, S_NAME, S_GENDER, S_AGE, S_MAJOR from STU");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int number = rs.getInt(1);
				String name = rs.getString(2);
				Gender gender = Gender.valueOf(rs.getString(3));
				int age = rs.getInt(4);
				String major = rs.getString(5);
				Student s = new Student(number, name, gender, age, major);
				result.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (cnt!=null) {
				try {
					cnt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}

}
