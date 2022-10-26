package xuan.xhaka.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import xuan.xhaka.entity.Cart;
import xuan.xhaka.impl.CartServiceImpl;

import java.util.HashMap;

@Controller
public class CartController {
	
	@Autowired
	CartServiceImpl cartService;
	
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
		
		//session.setMaxInactiveInterval(product_id);
		
		return "redirect:"+request.getHeader("Referer");
	}
	@RequestMapping(value="/trang-chu/editCart/{product_id}/{quantity}")
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
		
		
		return "redirect:"+request.getHeader("Referer");
	}
}
