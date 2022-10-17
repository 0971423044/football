package xuan.xhaka.services;

import xuan.xhaka.entity.User;

public interface LoginService {
		public boolean checkUserExist(String email, String password);
		public User getUserByEmail(String email);
}
