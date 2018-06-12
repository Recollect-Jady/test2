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
	//根据id查
	public Student findOne(int id) {
		String sql = "select * from STU where S_ID="+id;
		
		return jdbcTemplate.queryForObject(sql, new StudentRowMapper());
		
	}
	
	//添加
	public void add(Student student) {
		String sql = "insert into STU values(?,?,?,?,?,?)";
		jdbcTemplate.update(sql,student.getNumber(),student.getName(),student.getGender(),student.getAge(),
				student.getMajor(),student.getId());
	}
	
	//删除
	public void delete(Integer id) {
		String sql ="delete STU where where S_ID="+id;
		jdbcTemplate.update(sql);
	}
	
	//修改
	public void update(Student student) {
		String sql ="updata STU set S_NUMBER=?,S_NAME=?,S_GENDER=?,S_AGE=?,S_MAJOR=?,S_ID=?";
		jdbcTemplate.update(sql);
	}
}
