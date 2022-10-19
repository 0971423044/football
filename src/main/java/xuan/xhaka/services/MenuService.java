package xuan.xhaka.services;

import java.util.List;

import org.springframework.stereotype.Service;

import xuan.xhaka.entity.Menu;

@Service
public interface MenuService {
	
	public List<Menu> getAllMenus();

}
