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
	
	@RequestMapping(value="addCart/{product_id}")
	public String addCart(HttpServletRequest request,HttpSession session, @PathVariable("product_id") int product_id)
	{
		HashMap<Integer,Cart> cart = (HashMap<Integer, Cart>) session.getAttribute("Cart");
		if(cart == null)
		{
			cart = new HashMap<Integer, Cart>();
		}
		cart = cartService.addToCart(product_id, cart);
		
		session.setAttribute("Cart", cart);
		
		return "redirect:"+request.getHeader("Referer");
	}

}
