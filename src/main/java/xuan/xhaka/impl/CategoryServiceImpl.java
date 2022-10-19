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

}
