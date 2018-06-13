package exam6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
public class OperatorDaoImpl implements OperatorDao {
	private JdbcTemplate jdbcTemplate;
	private PasswordEncoder passwordEncoder;

	@Autowired
	public OperatorDaoImpl(JdbcTemplate jdbcTemplate, PasswordEncoder passwordEncoder) {
		this.jdbcTemplate = jdbcTemplate;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public List<Operator> findAll() {

		String sql = "select O_ID, USERNAME, ROLE, DISABLED from operators";
		return jdbcTemplate.query(sql, new OperatorRowMapper());
	}

	@Override
	public Operator findOne(Integer id) {
		String sql = "select * from operators where O_ID=?";
		try {
			return jdbcTemplate.queryForObject(sql, new OperatorDetailRowMapper(), id);

		} catch (EmptyResultDataAccessException ex) {
			return null;
		}
	}

	@Override
	public void create(String username, String password, String role) {
		String sql = "insert into operators(O_ID,USERNAME,PASSWORD,ROLE)"
				+ " values(seq_operators.nextval,?,?,?)";
		jdbcTemplate.update(sql, username,passwordEncoder.encode(password),role);
	}

	@Override
	public void updatePassword(Integer id, String newPassword) {
		String sql = "update operators set password=? where O_id=?";
		jdbcTemplate.update(sql,passwordEncoder.encode(newPassword),id);
	}

	@Override
	public void delete(Integer id) {
		String sql = "delete from operators where O_ID=?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public void disable(Integer id) {
		setAble(id, "true");
	}
	
	public void setAble(Integer id,String string) {
		String sql = "update operators set disabled=? where O_id=?";
		jdbcTemplate.update(sql, string,id);
	}
	
	
	@Override
	public void enable(Integer id) {
		setAble(id, "false");
	}

}
