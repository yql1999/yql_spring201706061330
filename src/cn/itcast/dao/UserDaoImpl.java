package cn.itcast.dao;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import cn.itcast.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	public void add() {
		User user = new User();
		user.setUsername("user02");
		user.setAddress("zjut");
		this.getHibernateTemplate().save(user);
	}
	
	
	@SuppressWarnings("unchecked")
	public List<User> getList(){
		return (List<User>) this.getHibernateTemplate().find("from User");
	}
		
	@SuppressWarnings("unchecked")
	public List<User> getListById(){
		return (List<User>) this.getHibernateTemplate().find("from User u where u.uid=1");
	}
	
	@SuppressWarnings("unchecked")
	public int getTotal() {
		List<User> list = (List<User>) this.getHibernateTemplate().find("select count(*) from User");
		return Integer.parseInt(((Object)list.get(0)).toString());
	}

	public void delete() {
		User user=(User)this.getHibernateTemplate().load(User.class,2);
        getHibernateTemplate().delete(user);
	}
	
}



