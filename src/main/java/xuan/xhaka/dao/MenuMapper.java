package xuan.xhaka.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import xuan.xhaka.entity.Menu;
import xuan.xhaka.util.MyBatisUtilConfig;

@Repository
public class MenuMapper {
	
	public List<Menu> getAllMenus()
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		
		List<Menu> listMenus = session.selectList("getAllMenus");
		session.commit();
		session.close();
		
		return listMenus;
	}
}
