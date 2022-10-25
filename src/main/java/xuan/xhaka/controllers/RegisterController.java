package xuan.xhaka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView showFormRegister()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/account/register");
		
		return mav;
	}
	

}
