package xuan.xhaka.services;

import xuan.xhaka.entity.Account;

public interface LoginService {
		public boolean checkUserExist(String email, String password);
		public Account getUserByEmail(String email);
}
