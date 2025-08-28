package Service;

import DAO.UserDao;
import DAO.UserDaoImpl;
import Model.User;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();


	@Override
	public User login(String username, String password) {
		User user = this.get(username);
		if (user != null && password.equals(user.getPassWord())) {
			return user;
		}
		return null;
	}

	public User get(String username) {
		return userDao.get(username);
	}

}