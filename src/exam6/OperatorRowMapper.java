package exam6;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OperatorRowMapper implements RowMapper<Operator> {

	@Override
	public Operator mapRow(ResultSet rs, int rowNumber) throws SQLException {
		return new Operator(
				rs.getInt(1),
				rs.getString(2),
				null, 
				rs.getString(3),
				Boolean.valueOf(rs.getString(4)));
	}

}
