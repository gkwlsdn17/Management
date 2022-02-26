package com.project.ManagementProgram;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.DTO.User;

@Controller
public class RegisterController {
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/register/save")
	public String save(User user, Model m) throws Exception {
		// ��ȿ�� �˻�
		if(!isValid(user)) {
			String msg = URLEncoder.encode("ȸ�����Կ� �����Ͽ����ϴ�. �ٽ� �õ����ּ���.","utf-8");
			return "redirect:/register?msg="+msg;
		}
		
		// DB�� insert
		return "registerInfo";
	}

	private boolean isValid(User user) {
		return true;
	}
}
