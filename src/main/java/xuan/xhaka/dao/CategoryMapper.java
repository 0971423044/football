package xuan.xhaka.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import xuan.xhaka.entity.Category;
import xuan.xhaka.util.MyBatisUtilConfig;


@Repository
public class CategoryMapper {
	public List<Category> getListCategories() {
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();

		List<Category> listCategories = session.selectList("getAllCategories");

		session.commit();
		session.close();

		return listCategories;
	}
}
