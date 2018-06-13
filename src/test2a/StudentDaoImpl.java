package test2a;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Student> queryAll() {
		String sql = "select S_NUMBER, S_NAME, S_GENDER, S_AGE, S_MAJOR,S_ID from STU";

		return jdbcTemplate.query(sql, new StudentRowMapper());
	}

	@Override
	//根据id查
	public Student findOne(Integer id) {
		String sql = "select * from STU where S_ID=?";
		return jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
	}

	@Override
	//添加
	public void add(Student student) {
		String sql = "insert into STU(S_NAME,S_GENDER,S_AGE,S_MAJOR,S_ID)"
				+ " values(?,?,?,?,?)";
		jdbcTemplate.update(sql,student.getName(),student.getGender().toString(),
				student.getAge(),student.getMajor(),student.getId());
	}

	@Override
	//删除
	public void delete(Integer id) {
		String sql = "delete from stu where S_ID=?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	//修改
	public void update(Student student) {
		String sql = "update stu set S_NAME=?,S_GENDER=?,S_AGE=?,S_MAJOR=? where S_ID=?";
		jdbcTemplate.update(sql, student.getName(),student.getGender().toString(),student.getAge(),
				student.getMajor(),student.getId());
	}
	
}
