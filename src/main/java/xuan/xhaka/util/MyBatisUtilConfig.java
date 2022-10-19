package xuan.xhaka.util;

import java.io.IOException;
import java.io.Reader;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtilConfig {
	private static SqlSessionFactory sqlSessionFactory;
	static {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("resources/mybatis-config-football.xml");
			
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory()
	{
		return sqlSessionFactory;
	}
	

}
