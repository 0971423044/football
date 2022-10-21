package xuan.xhaka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {
	
	@RequestMapping(value="/trang-chu/product-cat/{id_category}")
	public ModelAndView showProByCat(@PathVariable("id_category") int id_category)
	{
		ModelAndView mav= new ModelAndView("user/category");
		
		mav.addObject("idcat", id_category);
		return mav;
	}

}
