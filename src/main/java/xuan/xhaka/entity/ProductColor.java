package xuan.xhaka.entity;

public class ProductColor {
	private int id_color;
	private int product_id;
	private String name_color;
	private String code;
	private String img;
	
	private Product product;

	public int getId_color() {
		return id_color;
	}

	public void setId_color(int id_color) {
		this.id_color = id_color;
	}

	
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getName_color() {
		return name_color;
	}

	public void setName_color(String name_color) {
		this.name_color = name_color;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	public ProductColor(int id_color, int product_id, String name_color, String code, String img, Product product) {
		super();
		this.id_color = id_color;
		this.product_id = product_id;
		this.name_color = name_color;
		this.code = code;
		this.img = img;
		this.product = product;
	}

	public ProductColor()
	{
		
	}

}
