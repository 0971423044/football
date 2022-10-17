package xuan.xhaka.entity;

public class RegisterReq {
	private String email;
	private String password;
	private String rePassword;
	private String gender;
	private String address;
	private String phone;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public RegisterReq(String email, String password, String rePassword, String gender, String address, String phone) {
		super();
		this.email = email;
		this.password = password;
		this.rePassword = rePassword;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
	}
	public RegisterReq() {
		super();
	}
	
	
}
