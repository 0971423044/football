package xuan.xhaka.services;

import java.util.List;

import org.springframework.stereotype.Service;
import xuan.xhaka.entity.Product;
@Service
public interface ProductService {
	public List<Product> getListProductsHighligght();
	public List<Product> getListProductsNew();
}
