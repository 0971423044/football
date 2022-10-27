package xuan.xhaka.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import xuan.xhaka.entity.Account;
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
	public void AddCategory(Category category)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();

		session.insert("insertCategory", category);

		session.commit();
		session.close();
	}
	public void updateCategory(Category category)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		session.update("updateCategory", category);
		session.commit();
		session.close();
	}
	public void deleteCategory(int id_category)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		
		session.delete("deleteCategory", id_category);
		session.commit();
		session.close();
	}
	public Category getCatById(int id_category)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		Category category = (Category) session.selectOne("getCatById", id_category);
		session.commit();
		session.close();
		
		return category;
	}
}
