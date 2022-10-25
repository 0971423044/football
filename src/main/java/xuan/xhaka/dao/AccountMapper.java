package xuan.xhaka.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import xuan.xhaka.entity.Account;
import xuan.xhaka.util.MyBatisUtilConfig;

@Repository
public class AccountMapper {
	public int AddAccount(Account account)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		int insert=0;
		return insert;
	}

}
