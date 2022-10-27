package xuan.xhaka.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import xuan.xhaka.entity.Account;
import xuan.xhaka.entity.Bill;
import xuan.xhaka.entity.Cart;
import xuan.xhaka.impl.BillServiceImpl;
import xuan.xhaka.impl.CartServiceImpl;
import xuan.xhaka.impl.CategoryServiceImpl;
import xuan.xhaka.impl.MenuServiceImpl;
import xuan.xhaka.impl.ProductServiceImpl;
import xuan.xhaka.impl.SlideServiceImpl;

import java.util.HashMap;

@Controller
public class CartController {
	
	@Autowired
	CategoryServiceImpl catService;
	
	@Autowired
	MenuServiceImpl menuService;
	
	@Autowired
	SlideServiceImpl slideService;
	
	@Autowired
	ProductServiceImpl proService;
	
	@Autowired
	CartServiceImpl cartService;
	
	@Autowired 
	BillServiceImpl billService;
	
	@RequestMapping(value="/trang-chu/addCart/{product_id}")
	public String addCart(HttpServletRequest request,HttpSession session, @PathVariable("product_id") int product_id)
	{
		HashMap<Integer,Cart> cart = (HashMap<Integer,Cart>) session.getAttribute("Cart");
		if(cart == null)
		{
			cart = new HashMap<Integer, Cart>();
		}
		cart = cartService.addToCart(product_id, cart);
		
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantityCart", cartService.TotalQuantity(cart));
		session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));
		session.setMaxInactiveInterval(60*60*2);
		
		//session.setMaxInactiveInterval(product_id);
		
		return "redirect:"+request.getHeader("Referer");
	}
	@RequestMapping(value="/trang-chu/editCart/{product_id}/{quantity}",method=RequestMethod.POST)
	public String editCart(HttpServletRequest request,HttpSession session, @PathVariable("product_id") int product_id, @PathVariable("quantity") int quantity)
	{
		HashMap<Integer,Cart> cart = (HashMap<Integer,Cart>) session.getAttribute("Cart");
		if(cart == null)
		{
			cart = new HashMap<Integer, Cart>();
		}
		cart = cartService.editToCart(product_id,quantity, cart);
		
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantityCart", cartService.TotalQuantity(cart));
		session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));
		session.setMaxInactiveInterval(60*60*2);
		
		return "redirect:"+request.getHeader("Referer");
	}
	@RequestMapping(value="/trang-chu/deleteCart/{product_id}")
	public String deleteCart(HttpServletRequest request,HttpSession session, @PathVariable("product_id") int product_id)
	{
		HashMap<Integer,Cart> cart = (HashMap<Integer,Cart>) session.getAttribute("Cart");
		if(cart == null)
		{
			cart = new HashMap<Integer, Cart>();
		}
		cart = cartService.deleteToCart(product_id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantityCart", cartService.TotalQuantity(cart));
		session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));
		session.setMaxInactiveInterval(60*60*2);
		
		return "redirect:"+request.getHeader("Referer");
	}
	@RequestMapping(value="/trang-chu/checkout", method=RequestMethod.GET)
	public ModelAndView showCheckout(HttpServletRequest request, HttpSession session)
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("listCat",catService.getListCategories() );
		mav.setViewName("user/bills/checkout");
		Bill bill= new Bill();
		Account accLoginInfo = (Account)session.getAttribute("accLoginInfo");
		if(accLoginInfo!=null)
		{
			bill.setFullname(accLoginInfo.getFullname());
			bill.setEmail(accLoginInfo.getEmail());
			bill.setFullname(accLoginInfo.getFullname());
			bill.setAddress(accLoginInfo.getAddress());
			bill.setPhone(accLoginInfo.getPhone());
		}
		mav.addObject("bill", bill);
		return mav;
		
	}
	@RequestMapping(value="/trang-chu/checkout", method=RequestMethod.POST)
	public String processCheckout(HttpServletRequest request, HttpSession session,@ModelAttribute("bill") Bill bill )
	{
		if(billService.AddBill(bill)>0)
		{
			HashMap<Integer,Cart> carts = (HashMap<Integer, Cart>) session.getAttribute("Cart");
			billService.AddBillDetail(carts);
		}
		ModelAndView mav = new ModelAndView();
		session.removeAttribute("Cart");
		return "redirect:/trang-chu/your-cart";
		
	}
}
