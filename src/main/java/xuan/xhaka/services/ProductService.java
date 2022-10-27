package xuan.xhaka.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import xuan.xhaka.entity.Product;
@Service
public interface ProductService {
	public List<Product> getListProductsHighligght();
	public List<Product> getListProductsNew();
	public List<Product> getListProByCategory(int id_category);
	public List<Product> getListProByPaging(Map<String, Integer> pagingMap);
	public Product getProductById(int product_id);
	public List<Product> getListProducts();
	
	public void AddProduct(Product product);
	
	public void updateProduct(Product product);
	
	public void deleteProduct(int product_id);
}
