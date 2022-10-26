package xuan.xhaka.impl;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xuan.xhaka.dao.AccountMapper;
import xuan.xhaka.entity.Account;
import xuan.xhaka.services.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountMapper accMapper;
	@Override
	public int AddAccount(Account acc) {
		String passEncrypt = BCrypt.hashpw(acc.getPassword(),BCrypt.gensalt(12));
		acc.setPassword(passEncrypt);
		acc.setEnabled(true);
		acc.setRole("User");
		int count = accMapper.AddAccount(acc);
		// TODO Auto-generated method stub
		return count;
	}
	@Override
	public Account CheckAccExisted(Account acc) {
		String passInput = acc.getPassword();
		acc = accMapper.getAccByEmail(acc);
		
		
		// TODO Auto-generated method stub
		return acc;
	}
	@Override
	public List<Account> getListAccount() {
		// TODO Auto-generated method stub
		List<Account> listAcc = accMapper.getListAccount();
		return listAcc;
	}
	@Override
	public boolean CheckEmailDuplicated(String email) {
		
		Account acc = accMapper.getAccByEmail(email);
		if(acc != null)
		{
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
