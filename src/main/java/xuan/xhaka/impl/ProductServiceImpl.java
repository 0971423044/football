package xuan.xhaka.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xuan.xhaka.dao.ProductMapper;
import xuan.xhaka.entity.Product;
import xuan.xhaka.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	
	ProductMapper proMapper;

	@Override
	public List<Product> getListProductsHighligght() {
		// TODO Auto-generated method stub
		List<Product> listProHighlight = proMapper.getListProductsHighlight();
		return listProHighlight;
	}

	@Override
	public List<Product> getListProductsNew() {
		// TODO Auto-generated method stub
		List<Product> listProNew = proMapper.getListProductsNew();
		return listProNew;
	}

	@Override
	public List<Product> getListProByCategory(int id_category) {
		// TODO Auto-generated method stub
		List<Product> listProByCat = proMapper.getListProByCategory(id_category);
		return listProByCat;
	}

	@Override
	public List<Product> getListProByPaging(Map<String,Integer> pagingMap) {
		// TODO Auto-generated method stub
		List<Product> listProByPaging = proMapper.getListProByPaging(pagingMap);
		return listProByPaging;
	}

	@Override
	public Product getProductById(int product_id) {
		// TODO Auto-generated method stub
		Product product = proMapper.getProductById(product_id);
		return product;
	}

}
