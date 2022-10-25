package xuan.xhaka.controllers;

import org.springframework.stereotype.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@RequestMapping(value= {"/quan-tri/"}, method=RequestMethod.GET)
	public String showAdminPage()
	{
		return "admin/index";
	}
	
	@RequestMapping(value={"/admin/products"}, method=RequestMethod.GET)
	public String showProductManage()
	{
		return "admin/products";
	}
	@RequestMapping(value={"/admin/categories"}, method=RequestMethod.GET)
	public String showCategoryManage()
	{
		return "admin/products";
	}
	@RequestMapping(value={"/admin/users"}, method=RequestMethod.GET)
	public String showUserManage()
	{
		return "admin/products";
	}

}
