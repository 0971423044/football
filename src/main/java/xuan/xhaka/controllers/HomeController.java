package xuan.xhaka.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import xuan.xhaka.dao.CategoryMapper;
import xuan.xhaka.entity.Category;
import xuan.xhaka.entity.Product;
import xuan.xhaka.impl.CartServiceImpl;
import xuan.xhaka.impl.CategoryServiceImpl;
import xuan.xhaka.impl.MenuServiceImpl;
import xuan.xhaka.impl.ProductServiceImpl;
import xuan.xhaka.impl.SlideServiceImpl;

@Controller
public class HomeController {
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
	
	@RequestMapping(value={"/trang-chu"}, method = RequestMethod.GET)
	public ModelAndView homePage(Model model)
	{	
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("listCat", catService.getListCategories());
		mav.addObject("listMenus", menuService.getAllMenus());
		mav.addObject("listSlides", slideService.getListSlides());
		mav.addObject("listProHighlight", proService.getListProductsHighligght());
		mav.addObject("listProNew", proService.getListProductsNew());
		mav.setViewName("user/index");
		
		//model.addAttribute("listCat", listCategories);
		return mav;
	}
	
	@RequestMapping(value="/trang-chu/product")
	public ModelAndView showProduct()
	{
		ModelAndView mav = new ModelAndView("user/products/listProduct");
		List<Product> listPro = proService.getListProducts();
		List<Category> listCat = catService.getListCategories();
		mav.addObject("listCat", listCat);
		mav.addObject("listPro", listPro);
		
		return mav;
	}
	@RequestMapping(value="/trang-chu/product-detail/{product_id}")
	public ModelAndView showProductDetail(@PathVariable("product_id") int product_id)
	{
			ModelAndView mav = new ModelAndView();
			Product product = proService.getProductById(product_id);
			int id_category = product.getId_category();
			List<Product> listProByCat = proService.getListProByCategory(id_category);
			mav.addObject("product", product);
			mav.addObject("listProByCat", listProByCat);
			mav.setViewName("user/products/product");
			
			return mav;
	}
	
	@RequestMapping(value="/trang-chu/your-cart")
	public ModelAndView showListCart(HttpSession session)
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/cart/listCart");
		return mav;
	}
	@RequestMapping(value="/trang-chu/your-account")
	public ModelAndView showViewAccount()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("user/account/viewAccount");
		
		return mav;
	}
}
