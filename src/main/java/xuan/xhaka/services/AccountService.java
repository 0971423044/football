package xuan.xhaka.services;

import java.util.List;

import org.springframework.stereotype.Service;

import xuan.xhaka.entity.Account;

@Service
public interface AccountService {
	public int AddAccount(Account acc);
	public Account CheckAccExisted(Account acc);
	
	public boolean CheckEmailDuplicated(String email);
	public List<Account> getListAccount();
	public void deleteAccount(int id);
	public Account getAccById(int id);	
	public void updateAccount(Account acc);
}
