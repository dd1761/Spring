package user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service	//Service를 사용안할거면 root-context.xml에 가서 bean을 적용시켜줘야 함 
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	
	@Override
	public void write(UserDTO userDTO) {
		userDAO.write(userDTO);
		
	}


	@Override
	public List<UserDTO> getUserList() {
		
		return userDAO.getUserList();
	}


	@Override
	public String isExistId(String id) {
		UserDTO userDTO = userDAO.getUser(id);
		
		if(userDTO == null) {
			return "non_exist";
		}
		else {
			return "exist";
		}
		
	}


	@Override
	public UserDTO getUser(String id) {
		
		return userDAO.getUser(id);
	}
	
}
