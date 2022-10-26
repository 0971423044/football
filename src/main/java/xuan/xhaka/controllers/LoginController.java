package xuan.xhaka.controllers;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import xuan.xhaka.entity.Account;

import xuan.xhaka.entity.LoginReq;
import xuan.xhaka.impl.AccountServiceImpl;
import xuan.xhaka.impl.CategoryServiceImpl;
import xuan.xhaka.impl.ProductServiceImpl;

@Controller
public class LoginController {
	@Autowired
	CategoryServiceImpl catService;
	
	@Autowired
	ProductServiceImpl proService;
	
	@Autowired
	AccountServiceImpl accService;
	
	@RequestMapping(value="/trang-chu/login", method=RequestMethod.POST)
	public ModelAndView showFormLoginUser(@ModelAttribute("acc") Account acc)
	{
		ModelAndView mav = new ModelAndView();
		return mav;
	}
	

}