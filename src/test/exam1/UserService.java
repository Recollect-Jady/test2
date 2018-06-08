package test.exam1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	
	public UserService(UserDao userDao, BCryptPasswordEncoder passwordEncoder) {
		super();
		this.userDao = userDao;
		this.passwordEncoder = passwordEncoder;
	}


	public void register(String username, String password) {
		System.out.println("检查用户名" + username + "是否存在...");
		if (userDao.usernameExists(username)) {
			System.out.println("注册失败，用户名:" + username + "已存在");

		} else {
			System.out.println("加密明文密码...");
			String pwd = passwordEncoder.encode(password);
			userDao.insert(username, pwd);
		}
	}

}
