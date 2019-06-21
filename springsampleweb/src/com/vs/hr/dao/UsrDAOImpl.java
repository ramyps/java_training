package com.vs.hr.dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.vs.hr.vo.UserVO;

/**
 * DBAccess
 */
public class UsrDAOImpl implements UsrDAO {

	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	// Emp Queries

	public void addUsr(UserVO usr) throws Exception {
		Object[] oa = new Object[3];
		oa[0] = usr.getFirstName();
		oa[1] = usr.getLastName();
		oa[2] = usr.getMiddleName();

		this.jdbcTemplate.update
		("INSERT INTO usr(firstname, lastname, middlename)" +
				" VALUES  (?,?,?)", oa);
	}

	public UserVO getUsr(int usrID) throws Exception {
		
		UserVO userVO = (UserVO) this.jdbcTemplate.
				queryForObject(
			    "select * from usr where usrid = ?",
			    new Object[]{new Integer(usrID)},
			    new RowMapper() {
			        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			        	UserVO userVO = new UserVO();
			        	userVO.setFirstName(rs.getInt(1));
			        	userVO.setLastName(rs.getString(2));
			        	userVO.setMiddleName(rs.getString(3));
			        	return userVO;
			        }
			    });
		return userVO;
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
}
