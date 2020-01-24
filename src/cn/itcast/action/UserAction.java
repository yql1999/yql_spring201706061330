package cn.itcast.action;


import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import com.opensymphony.xwork2.ActionSupport;
import cn.itcast.entity.User;
import cn.itcast.service.UserService;

public class UserAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private UserService userService = null;
	
	public UserService getUserService() {
		return userService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String add() {
		System.out.println("action add.............");
		userService.add();
		return "success";
	}
	
	public String getList() {
		System.out.println("action getList.............");
		userService.getList();
		return "success";
	}
	
	public String getListById() {
		System.out.println("action getListById.............");
		userService.getListById();
		return "success";
	}
	
	public String getTotal() {
		System.out.println("action getTotal.............");
		userService.getTotal();
		return "success";
	}
	
	public String delete() {
		System.out.println("action delete.............");
		userService.delete();
		return "success";
	}
	
}
