package xuan.xhaka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import xuan.xhaka.entity.Account;
import xuan.xhaka.impl.AccountServiceImpl;
import xuan.xhaka.impl.CategoryServiceImpl;
import xuan.xhaka.impl.ProductServiceImpl;

@Controller
public class RegisterController {
	@Autowired
	CategoryServiceImpl catService;
	
	@Autowired
	ProductServiceImpl proService;
	
	@Autowired
	AccountServiceImpl accService;
	
	@RequestMapping(value="/trang-chu/register", method=RequestMethod.GET)
	public ModelAndView showFormRegister()
	{
		Account acc = new Account();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/account/register");
		mav.addObject("listCat", catService.getListCategories());
		mav.addObject("acc",acc);
		return mav;
	}
	@RequestMapping(value="/trang-chu/register", method=RequestMethod.POST)
	public ModelAndView processRegister(@ModelAttribute("acc") Account acc)
	{
		ModelAndView mav = new ModelAndView();
		if(accService.CheckEmailDuplicated(acc.getEmail())==true)
		{
			mav.addObject("message", "Email already exist in database!");
		}else
		{
			int count = accService.AddAccount(acc);
			if(count>0)
			{
				mav.addObject("status", "Registration successfully!");
			}else {
				mav.addObject("status", "Registration failed!");
			}
		}
		mav.setViewName("user/account/register");
		mav.addObject("listCat", catService.getListCategories());
		return mav;
	}
	

}
