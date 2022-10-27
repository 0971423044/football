package xuan.xhaka.entity;

import java.sql.Timestamp;
import java.util.List;

public class Bill {
	private int bill_id;
	private String fullname;
	private String email;
	private String phone;
	private String address;
	private String note;
	private boolean shipCod;
	private double total;
	private int quantity;
	private Timestamp created_Date;
	private List<BillDetail> listBillDetail;
	
	public int getBill_id() {
		return bill_id;
	}
	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public boolean isShipCod() {
		return shipCod;
	}
	public void setShipCod(boolean shipCod) {
		this.shipCod = shipCod;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Timestamp getCreated_Date() {
		return created_Date;
	}
	public void setCreated_Date(Timestamp created_Date) {
		this.created_Date = created_Date;
	}
	
	public List<BillDetail> getListBillDetail() {
		return listBillDetail;
	}
	public void setListBillDetail(List<BillDetail> listBillDetail) {
		this.listBillDetail = listBillDetail;
	}
	public Bill()
	{
		
	}
	
}
