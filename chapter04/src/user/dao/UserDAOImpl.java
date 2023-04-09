package user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import lombok.Setter;
import user.bean.UserDTO;

/*
public class UserDAOImpl implements UserDAO{
	@Setter
	private JdbcTemplate jdbcTemplate = null;
	
	@Override
	public void write(UserDTO userDTO) {
		String sql = "insert into usertable values(?,?,?)";
		jdbcTemplate.update(sql, userDTO.getName(), userDTO.getId(), userDTO.getPwd());
		
	}


	@Override
	public List<UserDTO> getUserList() {
		String sql = "select * from usertable";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class)); 
		//RowMapper은 한줄의 데이터값 중 하나의 데이터들으 한개의 데이터와 매핑하여 넣어준다.
	}

}*/


public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO{
	//@Setter
	//private JdbcTemplate jdbcTemplate = null;
	//JdbcDaoSupport 상속하였으므로 jdbcTemplate를 빈으로 생성할 필요가 없다.
	
	
	@Override
	public void write(UserDTO userDTO) { //NamedParameterJdbcDaoSupport는 Map으로만 받아야한다.
		String sql = "insert into usertable values(:name,:id,:pwd)";
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", userDTO.getName());
		map.put("id", userDTO.getId());
		map.put("pwd", userDTO.getPwd());
		
		getNamedParameterJdbcTemplate().update(sql, map);
		
	}


	@Override
	public List<UserDTO> getUserList() {
		String sql = "select * from usertable";
		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class)); 
		//RowMapper은 한줄의 데이터값 중 하나의 데이터들으 한개의 데이터와 매핑하여 넣어준다.
	}

	@Override
	public void update(UserDTO userDTO) {
		String sql = "update usertable set name=(:name), pwd=(:pwd) where id=(:id)";
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", userDTO.getName());
		map.put("id", userDTO.getId());
		map.put("pwd", userDTO.getPwd());
		
		getNamedParameterJdbcTemplate().update(sql, map);
		
	}


	@Override
	public void delete(String id) {
		String sql = "delete usertable where id=(:id)";
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		getNamedParameterJdbcTemplate().update(sql, map);
	}
	
}

