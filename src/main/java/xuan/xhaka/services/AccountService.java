package xuan.xhaka.services;

import java.util.List;

import org.springframework.stereotype.Service;

import xuan.xhaka.entity.Account;

@Service
public interface AccountService {
	public int AddAccount(Account acc);
	public Account CheckAccExisted(Account acc);
	public List<Account> getListAccount();
	public boolean CheckEmailDuplicated(String email);
}
