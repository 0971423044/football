package xuan.xhaka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import xuan.xhaka.entity.Account;

@Controller
public class RegisterController {
	@RequestMapping(value="/trang-chu/register", method=RequestMethod.GET)
	public ModelAndView showFormRegister()
	{
		Account acc = new Account();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/account/register");
		mav.addObject("acc",acc);
		return mav;
	}
	@RequestMapping(value="/trang-chu/register", method=RequestMethod.POST)
	public ModelAndView processRegister(@ModelAttribute("acc") Account acc)
	{
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/account/register");
		mav.addObject("acc",acc);
		return mav;
	}
	

}
