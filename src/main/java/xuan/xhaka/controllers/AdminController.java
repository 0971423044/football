package xuan.xhaka.controllers;

import org.springframework.stereotype.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import xuan.xhaka.entity.Account;
import xuan.xhaka.entity.Bill;
import xuan.xhaka.entity.BillDetail;
import xuan.xhaka.entity.Category;
import xuan.xhaka.entity.Product;
import xuan.xhaka.impl.AccountServiceImpl;
import xuan.xhaka.impl.BillServiceImpl;
import xuan.xhaka.impl.CategoryServiceImpl;
import xuan.xhaka.impl.ProductServiceImpl;

@Controller
public class AdminController {
	@Autowired
	AccountServiceImpl accService;
	
	@Autowired
	CategoryServiceImpl catService;
	
	@Autowired
	ProductServiceImpl proService;
	
	@Autowired
	BillServiceImpl billService;
	
	@RequestMapping(value= {"/admin/"}, method=RequestMethod.GET)
	public ModelAndView showAdminPage()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("admin/index");
		
		return mav;
	}
	
	@RequestMapping(value={"/admin/listAccount"}, method=RequestMethod.GET)
	public ModelAndView showAccountManage()
	{
		ModelAndView mav  = new ModelAndView();
		List<Account> listAccount = accService.getListAccount();
		
		mav.setViewName("admin/account/listAccount");
		
		mav.addObject("listAccount", listAccount);
		return mav;
	}
	@RequestMapping(value={"/admin/showFormAddAcc"}, method=RequestMethod.GET)
	public ModelAndView showFormNewAcc()
	{
		ModelAndView mav  = new ModelAndView();
		Account account = new Account();
		
		mav.setViewName("admin/account/account");
		return mav;
	}
	@RequestMapping(value={"/admin/addAccount"}, method=RequestMethod.POST)
	public ModelAndView saveAccount(@ModelAttribute("account") Account account)
	{
		ModelAndView mav = new ModelAndView();
		
		if(account==null)
		{
			accService.AddAccount(account);
		}else {
			accService.updateAccount(account);
		}
		mav.setViewName("redirect:admin/account/listAccount");
		return mav;
	}
	@RequestMapping(value="/admin/deleteAcc/{id}")
	public String deleteAccount(@PathVariable("id") int id)
	{
		accService.deleteAccount(id);
		
		return "redirect:/admin/account/listAccount";
		
	}
	@RequestMapping(value={"/admin/listCat"}, method=RequestMethod.POST)
	public ModelAndView showListCat()
	{
		ModelAndView mav = new ModelAndView();
		
		List<Category> listCat = catService.getListCategories();
		
		mav.addObject("listCat",listCat);
		mav.setViewName("admin/category/listCategory");
		return mav;
	}
	@RequestMapping(value={"/admin/showFormAddCat"}, method=RequestMethod.GET)
	public ModelAndView showFormNewCat()
	{
		ModelAndView mav  = new ModelAndView();
		Category category = new Category();
		
		mav.setViewName("admin/category/category");
		return mav;
	}
	@RequestMapping(value={"/admin/addCategory"}, method=RequestMethod.POST)
	public ModelAndView saveCategory(@ModelAttribute("category") Category category)
	{
		ModelAndView mav = new ModelAndView();
		
		if(category==null)
		{
			catService.AddCategory(category);
		}else {
			catService.updateCategory(category);
		}
		mav.setViewName("redirect:admin/category/listCategory");
		return mav;
	}
	@RequestMapping(value="/admin/deleteCat/{id_category}")
	public String deleteCategory(@PathVariable("id_category") int id_category)
	{
		catService.deleteCategory(id_category);
		
		return "redirect:/admin/account/listAccount";
	}
	@RequestMapping(value={"/admin/listProduct"}, method=RequestMethod.GET)
	public ModelAndView showListPro()
	{
		ModelAndView mav = new ModelAndView();
		
		List<Product> listPro = proService.getListProducts();
		
		mav.addObject("listPro",listPro);
		mav.setViewName("admin/product/listProduct");
		return mav;
	}
	@RequestMapping(value={"/admin/showFormAddPro"}, method=RequestMethod.GET)
	public ModelAndView showFormNewPro()
	{
		ModelAndView mav  = new ModelAndView();
		Product product = new Product();
		
		mav.setViewName("admin/product/product");
		return mav;
	}
	@RequestMapping(value={"/admin/addProduct"}, method=RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute("product") Product product)
	{
		ModelAndView mav = new ModelAndView();
		
		if(product==null)
		{
			proService.AddProduct(product);
		}else {
			proService.updateProduct(product);
		}
		mav.setViewName("redirect:admin/product/listProduct");
		return mav;
	}
	@RequestMapping(value="/admin/deleteProduct/{product_id}")
	public String deleteProduct(@PathVariable("product_id") int product_id)
	{
		proService.deleteProduct(product_id);
		
		return "redirect:/admin/product/listProduct";
	}
	@RequestMapping(value={"/admin/listBill"}, method=RequestMethod.GET)
	public ModelAndView showListBill()
	{
		ModelAndView mav = new ModelAndView();
		
		List<Bill> listBill = billService.getListBill();
		
		mav.addObject("listBill",listBill);
		mav.setViewName("admin/bill/listBill");
		return mav;
	}
	@RequestMapping(value={"/admin/listBillDetail"}, method=RequestMethod.GET)
	public ModelAndView showListBillDetail()
	{
		ModelAndView mav = new ModelAndView();
		
		List<BillDetail> listBillDetail = billService.getListBillDetail();
		
		mav.addObject("listBillDetail",listBillDetail);
		mav.setViewName("admin/bill/listBillDetail");
		return mav;
	}
}
