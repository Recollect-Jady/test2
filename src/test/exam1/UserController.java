package test.exam1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	public void register(String username, String password) {
		System.out.println("注册用户:" + username);
		userService.register(username, password);
	}
}
