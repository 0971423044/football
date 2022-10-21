package xuan.xhaka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {
	
	@RequestMapping(value="/product-cat/{id_category}")
	public ModelAndView showProByCat(Model model, @PathVariable("id_category") int id_category)
	{
		ModelAndView mav= new ModelAndView("user/category");
		return mav;
	}

}
