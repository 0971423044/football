package xuan.xhaka.controllers;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView showFormRegister()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/account/register");
		
		return mav;
	}
	
}

