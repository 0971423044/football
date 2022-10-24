package xuan.xhaka.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import xuan.xhaka.entity.Product;
import xuan.xhaka.impl.ProductServiceImpl;

@Controller
public class CategoryController {
	
	@Autowired
	ProductServiceImpl proService;
	
	@RequestMapping(value="/trang-chu/product-cat/{id_category}")
	public ModelAndView showProByCat(@PathVariable("id_category") int id_category)
	{
		ModelAndView mav= new ModelAndView("user/category");
		List<Product> listProByCat = proService.getListProByCategory(id_category);
		mav.addObject("idcat", id_category);
		mav.addObject("listProByCat", listProByCat);
		return mav;
	}

}
