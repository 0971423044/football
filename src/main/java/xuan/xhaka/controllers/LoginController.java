package xuan.xhaka.controllers;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import xuan.xhaka.entity.LoginReq;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView showFormLogin(Model model,LoginReq loginReq)
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login.jsp");
		mav.addObject("loginReq", loginReq);
		return mav;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView processLogin(HttpRequest req, HttpResponse res, @ModelAttribute("loginReq") LoginReq loginReq)
	{
		ModelAndView mav = new ModelAndView();
		return mav;
	}
}