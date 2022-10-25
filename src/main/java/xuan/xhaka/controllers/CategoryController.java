package xuan.xhaka.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import xuan.xhaka.dto.PaginatesDto;
import xuan.xhaka.entity.Product;
import xuan.xhaka.impl.PaginateServiceImpl;
import xuan.xhaka.impl.ProductServiceImpl;

@Controller
public class CategoryController {
	
	@Autowired
	ProductServiceImpl proService;
	
	@Autowired 
	PaginateServiceImpl paginateService;
	private int totalProPerPage = 6;
	@RequestMapping(value="/trang-chu/product-cat/{id_category}")
	public ModelAndView showProByCat(@PathVariable("id_category") int id_category)
	{
		
		ModelAndView mav= new ModelAndView("user/products/category");
		Map<String,Integer> pagingMap = new HashMap<String,Integer>();
	
		List<Product> listProByCat = proService.getListProByCategory(id_category);
		
		int totalData = listProByCat.size();
		
		PaginatesDto paginateInfo = paginateService.getInfoPaginate(totalData,totalProPerPage,1);
		
		 int start = paginateInfo.getStart();
		 int end= paginateInfo.getEnd();
		pagingMap.put("start", paginateInfo.getStart());
		pagingMap.put("end", paginateInfo.getEnd());
		
		List<Product> listProByPaging = proService.getListProByPaging(pagingMap);
		
		mav.addObject("idcat", id_category);
		mav.addObject("listProByCat", listProByCat);
		mav.addObject("paginateInfo", paginateInfo);
		mav.addObject("listProByPaging",listProByPaging);
		return mav;
	}
	@RequestMapping(value="/trang-chu/product-cat/{id_category}/{currentPage}")
	public ModelAndView showProByCat(@PathVariable("id_category") int id_category,@PathVariable int currentPage)
	{
		ModelAndView mav= new ModelAndView("user/products/category");
		Map<String,Integer> pagingMap = new HashMap<String,Integer>();
		
		List<Product> listProByCat = proService.getListProByCategory(id_category);
		
		int totalData = listProByCat.size();
		
		PaginatesDto paginateInfo = paginateService.getInfoPaginate(totalData,totalProPerPage,currentPage);
		
		int start = paginateInfo.getStart();
		int end= paginateInfo.getEnd();
		pagingMap.put("start", paginateInfo.getStart());
		pagingMap.put("end", paginateInfo.getEnd());
		
		List<Product> listProByPaging = proService.getListProByPaging(pagingMap);
		
		mav.addObject("idcat", id_category);
		mav.addObject("listProByCat", listProByCat);
		mav.addObject("paginateInfo", paginateInfo);
		mav.addObject("listProByPaging",listProByPaging);
		return mav;
	}
	

}
