package xuan.xhaka.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import xuan.xhaka.entity.Product;
import xuan.xhaka.util.MyBatisUtilConfig;

@Repository
public class ProductMapper {
	
	public List<Product> getListProductsHighlight()
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		
		List<Product> listProHighlight = session.selectList("getProductsHighlight");
		session.commit();
		session.close();
		return listProHighlight;
	}
	public List<Product> getListProductsNew()
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		
		List<Product> listProNew = session.selectList("getProductsNew");
		
		session.commit();
		session.close();
		return listProNew;
	}
	
	public List<Product> getListProByCategory(int id_category)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		List<Product> listProByCategory = session.selectList("getProductByCategory", id_category);
		
		session.commit();
		session.close();
		
		return listProByCategory;
	}
	public List<Product> getListProByPaging(Map<String,Integer> pagingMap )
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		List<Product> listProByPaging= session.selectList("getProByPaging", pagingMap);
		
		session.commit();
		session.close();
		
		return listProByPaging;
		
	}
	public Product getProductById( int product_id)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		
		Product product = (Product) session.selectOne("getProductById", product_id);
		session.commit();
		session.close();
		
		return product;
	}
	public List<Product> getListProduct()
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		List<Product> listPro = session.selectList("getAllProducts");
		
		session.commit();
		session.close();
		
		return listPro;
	}
	public void AddProduct(Product product)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		session.insert("insertProduct", product);
		session.commit();
		session.close();
	}
	
	public void updateProduct(Product product)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		session.update("updateProduct", product);
		session.commit();
		session.close();
	}
	public void deleteProduct(int product_id)
	{
		SqlSession session = MyBatisUtilConfig.getSqlSessionFactory().openSession();
		session.delete("deleteProduct", product_id);
		session.commit();
		session.close();
	}
}
