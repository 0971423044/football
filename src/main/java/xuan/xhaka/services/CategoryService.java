package xuan.xhaka.services;

import java.util.List;

import org.springframework.stereotype.Service;

import xuan.xhaka.entity.Category;

@Service
public interface CategoryService {
	
	public List<Category> getListCategories();
	public void AddCategory(Category category);
	
	public Category getCatById(int id_category);
	
	public void updateCategory(Category cayegory);
	
	public void deleteCategory(int id_category);

}
