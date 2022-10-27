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
	
	@RequestMapping(value= {"/admin/"}, method=RequestMethod.GET)
	public ModelAndView showAdminPage()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("admin/account/index");
		
		return mav;
	}
	
	@RequestMapping(value={"/admin/account"}, method=RequestMethod.GET)
	public ModelAndView showAccountManage()
	{
		ModelAndView mav  = new ModelAndView();
		mav.setViewName("admin/account/listAccount");
		return mav;
	}
	@RequestMapping(value={"/admin/showFormAdd"}, method=RequestMethod.GET)
	public ModelAndView showCategoryManage()
	{
		ModelAndView mav  = new ModelAndView();
		mav.setViewName("admin/account");
		return mav;
	}
	@RequestMapping(value={"/admin/addAccount"}, method=RequestMethod.POST)
	public String saveAccount()
	{
		return "admin/products";
	}

}
