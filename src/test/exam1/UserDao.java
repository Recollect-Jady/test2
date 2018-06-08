package test.exam1;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public boolean usernameExists(String username) {
		if (username.equals("admin")) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(String username, String pwd) {
		System.out.println("插入用户" + username + "密码" + pwd);
	}

}
