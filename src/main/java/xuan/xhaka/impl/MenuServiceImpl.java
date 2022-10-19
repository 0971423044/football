package xuan.xhaka.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xuan.xhaka.dao.MenuMapper;
import xuan.xhaka.entity.Menu;
import xuan.xhaka.services.MenuService;

@Service
public class MenuServiceImpl implements MenuService{
	
	@Autowired
	MenuMapper menuMapper;
	@Override
	public List<Menu> getAllMenus() {
		// TODO Auto-generated method stub
		List<Menu> listMenus  = menuMapper.getAllMenus();
		return listMenus;
	}
	
}
