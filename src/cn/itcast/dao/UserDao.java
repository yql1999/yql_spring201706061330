package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.User;

public interface UserDao {

	public void add();
	public List<User> getList();
	public List<User> getListById();
	public int getTotal();
	public void delete();
}
