package xuan.xhaka.entity;

public class BillDetail {
	private int id;
	private int product_id;
	private int bill_id;
	private int quantity;
	private double total;
	private int sale_off;
	private Bill bill;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	
	public int getBill_id() {
		return bill_id;
	}
	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getSale_off() {
		return sale_off;
	}
	public void setSale_off(int sale_off) {
		this.sale_off = sale_off;
	}
	
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	public BillDetail()
	{
		
	}
	

}
