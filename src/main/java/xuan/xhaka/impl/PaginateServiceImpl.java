package xuan.xhaka.impl;

import org.springframework.stereotype.Service;

import xuan.xhaka.dto.PaginatesDto;
import xuan.xhaka.services.PaginateService;

@Service
public class PaginateServiceImpl implements PaginateService{

	@Override
	public PaginatesDto getInfoPaginate(int totalData, int limit, int currentPage) {
		// TODO Auto-generated method stub
		PaginatesDto page  = new PaginatesDto();
		
		page.setLimit(limit);
		page.setTotalPage(setInfoTotalPage(totalData,limit));
		page.setCurrentPage(FindCurrentPage(currentPage, page.getTotalPage()));
		page.setStart(FindStart(currentPage, limit));
		page.setEnd(FindEnd(page.getStart(), limit, totalData));
		return page;
	}

	private Integer setInfoTotalPage(int totalData, int limit) {
		// TODO Auto-generated method stub
		int totalPage=0;
		totalPage= totalData/limit;
		totalPage= totalPage*limit < totalData ? totalPage+1 : totalPage;
		return totalPage;
	}
	
	private Integer FindCurrentPage(int currentPage, int totalPage)
	{
		if(currentPage<1)
			return 1;
		if(currentPage > totalPage)
			return totalPage;
		return currentPage;
	}
	private int FindStart(int currentPage, int limit)
	{
		int start = ((currentPage-1)*limit) +1;
		return start;
	}
	private int FindEnd(int start, int limit, int totalData) {
		// TODO Auto-generated method stub
		 int end = (start+limit) > totalData ? totalData : ((start+limit)-1);
		return 0;
	}

	
}
