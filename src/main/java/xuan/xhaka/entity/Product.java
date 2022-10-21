package xuan.xhaka.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Product {
	private int product_id;
	private String productname;
	private double price;
	private int quantity;
	private boolean status;
	private String title;
	private boolean highlight;
	private boolean product_new;
	private String detail;
	private String size;
	private int sale;
	private int id_category;
	private Date created_at;
	private Date updated_at;
	private List<ProductColor> listColor;
	
	private Category category;
	
	
	
	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	public int getProduct_id() {
		return product_id;
	}



	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}



	public String getProductname() {
		return productname;
	}



	public void setProductname(String productname) {
		this.productname = productname;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public boolean isHighlight() {
		return highlight;
	}



	public void setHighlight(boolean highlight) {
		this.highlight = highlight;
	}



	public boolean isProduct_new() {
		return product_new;
	}



	public void setProduct_new(boolean product_new) {
		this.product_new = product_new;
	}



	public String getDetail() {
		return detail;
	}



	public void setDetail(String detail) {
		this.detail = detail;
	}



	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public int getSale() {
		return sale;
	}



	public void setSale(int sale) {
		this.sale = sale;
	}



	public int getId_category() {
		return id_category;
	}



	public void setId_category(int id_category) {
		this.id_category = id_category;
	}



	public Date getCreated_at() {
		return created_at;
	}



	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}



	public Date getUpdated_at() {
		return updated_at;
	}



	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}



	public List<ProductColor> getListColor() {
		return listColor;
	}



	public void setListColor(List<ProductColor> listColor) {
		this.listColor = listColor;
	}



	public Product()
	{
		
	}
	

}
