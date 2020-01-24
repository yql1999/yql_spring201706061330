package cn.itcast.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.UserDaoImpl;
import cn.itcast.entity.User;

@Transactional
public class UserService {

	private UserDao userDao = null;
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add() {
		System.out.println("service add........");
		userDao.add();
	}
	
	public void getList(){
		System.out.println("service getList........");
		List<User> list = userDao.getList();
		for (User user : list) {
			System.out.println(user.getUsername()+"::"+user.getAddress());
		}
	}
	
	public void getListById(){
		System.out.println("service getListById........");
		List<User> list = userDao.getList();
		for (User user : list) {
			System.out.println("�û�����" + user.getUsername() + "��" + "�û���ַ��" + user.getAddress());
		}
	}
	
	public void getTotal() {
		System.out.println("service getTotal........");
		System.out.println("�û���������Ϊ��" + userDao.getTotal());
	}
	
	public void delete() {
		System.out.println("service delete........");
		userDao.delete();
		System.out.println("��ɾ�����²���ļ�¼��");
	}
}
