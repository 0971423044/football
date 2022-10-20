package xuan.xhaka.impl;

import java.util.List;

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

}
