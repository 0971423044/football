package xuan.xhaka.dto;

public class PaginatesDto {
	
	//trang hiện tại
	private int currentPage;
	//số lượng sp trong 1 trang
	private int limit;
	
	//sản phẩm đầu tiên của trang
	private int start;
	//sản phẩm cuối của trang
	private int end;
	//tổng số page 
	private int totalPage;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public PaginatesDto(int currentPage, int limit, int start, int end, int totalPage) {
		super();
		this.currentPage = currentPage;
		this.limit = limit;
		this.start = start;
		this.end = end;
		this.totalPage = totalPage;
	}
	
	public PaginatesDto()
	{
		
	}
	

}
