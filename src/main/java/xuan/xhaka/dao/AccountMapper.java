package xuan.xhaka.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import xuan.xhaka.entity.Account;
import xuan.xhaka.util.MyBatisUtilConfig;

@Repository
public class AccountMapper {
	public int AddAccount(Account account)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		
		int count =session.insert("insertAccount", account);
		session.commit();
		session.close();
		return count;
	}
	
	public Account getAccByEmail(Account acc)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		
		acc = (Account) session.selectOne("getAccountByEmail", acc.getEmail());
		
		session.commit();
		session.close();
		
		return acc;
	}
	public List<Account> getListAccount()
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		
		List<Account> listAcc = session.selectList("getAllAccounts");
		session.commit();
		session.close();
		
		return listAcc;
	}
	public Account getAccByEmail(String email)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		
		Account acc = (Account) session.selectOne("getAccountByEmail", email);
		
		session.commit();
		session.close();
		
		return acc;
	}

}
