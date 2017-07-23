package com.it355.service.impl;

import org.springframework.stereotype.Service;

import com.it355.model.LoginBean;
import com.it355.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	public String validateUser(LoginBean loginBean) {
		String username = loginBean.getUsername();
		String password = loginBean.getPassword();
			return "true";
		} else {
			return "false";
		}
	}
}
