package xuan.xhaka.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xuan.xhaka.dao.CategoryMapper;
import xuan.xhaka.entity.Category;
import xuan.xhaka.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	
	@Autowired
	CategoryMapper catMapper;
	@Override
	public List<Category> getListCategories() {
		
		List<Category> listCategories = catMapper.getListCategories();
		// TODO Auto-generated method stub
		return listCategories;
	}
	@Override
	public void AddCategory(Category category) {
		// TODO Auto-generated method stub
		catMapper.AddCategory(category);
		
	}
	@Override
	public Category getCatById(int id_category) {
		// TODO Auto-generated method stub
		return catMapper.getCatById(id_category);
	}
	@Override
	public void updateCategory(Category cayegory) {
		// TODO Auto-generated method stub
		catMapper.updateCategory(cayegory);
	}
	@Override
	public void deleteCategory(int id_category) {
		// TODO Auto-generated method stub
		catMapper.deleteCategory(id_category);
	}

}
