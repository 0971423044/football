package xuan.xhaka.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import xuan.xhaka.entity.Account;
import xuan.xhaka.impl.AccountServiceImpl;

@Controller
public class LoginAdminController {
	@Autowired
	private AccountServiceImpl accountService;
	
	@RequestMapping(value="/loginAdmin",method=RequestMethod.GET)
	public ModelAndView showFormLogin()
	{
		ModelAndView mav = new ModelAndView();
		Account acc = new Account();
		mav.setViewName("/jsps/login");
		mav.addObject("acc", acc);
		return mav;
	}
	@RequestMapping(value="/admin/login", method=RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute("account") Account accAdmin, HttpSession session )
	{
		ModelAndView mav = new ModelAndView();
		accAdmin = accountService.CheckAccExisted(accAdmin);
		if(accAdmin!=null)
		{
			if(accAdmin.getRole().equals("Admin") && accAdmin.isEnabled()==true)
			{
				mav.setViewName("redirect:/admin/all");
				session.setAttribute("loginAdmin", accAdmin);
			}else {
				mav.addObject("statusLogin", "You don't have permission or your account is locking!");
			}
		}else {
				mav.addObject("statusLogin","Login failed! Please try again!");
		}
		return mav;
	}
	@RequestMapping(value="admin/logout", method=RequestMethod.GET)
	public String logout(HttpSession session, HttpServletRequest request)
	{
		
		session.removeAttribute("loginAdmin");
		session.invalidate();
		return "redirect:"+ request.getHeader("Referer");
	}
}
