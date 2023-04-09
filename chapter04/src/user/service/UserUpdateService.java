package user.service;

import java.util.List;
import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserUpdateService implements UserService {
	@Setter
	private UserDTO userDTO = null;
	@Setter
	private UserDAO userDAO = null;
	
	private String name;
	private String id;
	private String pwd;
	
	@Override
	public void execute() {
		//수정 할 아이디 입력 : ???;
		//찾고자 하는 아이디가 없습니다.
		
		//수정할 아이디 입력 : hong;
		//이름	아이디	패스워드
		//???	hong	111
		
		//수정할 이름 입력 : ???
		//수정할 비번 입력 : ???
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("찾고자 하는 아이디 입력 : ");
		id = scanner.next();
		
		List<UserDTO> list = userDAO.getUserList();
		int search = 0;
		
		for(UserDTO userDTO : list) {
			if(userDTO.getId().equals(id)) {
				search = 1;
				
				System.out.println(userDTO.getName() + "\t"
						 + userDTO.getId() + "\t"
						 + userDTO.getPwd());
				System.out.print("수정할 이름 입력 : ");
				name = scanner.next();
				
				System.out.print("수정할 비밀번호 입력 : ");
				pwd = scanner.next();
				
				//데이터
				userDTO.setName(name);
				userDTO.setPwd(pwd);
				
				//DB
				userDAO.update(userDTO);
			}
			
		}
		if(search == 0) {
			System.out.println("찾고자 하는 아이디가 없습니다.");
		}
	}

}
