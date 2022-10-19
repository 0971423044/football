package xuan.xhaka.services;

import java.util.List;

import org.springframework.stereotype.Service;

import xuan.xhaka.entity.Category;

@Service
public interface CategoryService {
	
	public List<Category> getListCategories();

}
