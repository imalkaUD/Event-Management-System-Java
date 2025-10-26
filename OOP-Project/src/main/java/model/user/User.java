package model.user;

public class User {
	
	//Attributes in User class
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String mobile;
	private String address;
	private String join_date;
	private String NIC;
	private String role;
	
	//Default Constructor
	public User() {}
	
	//Overloaded Constructors
	public User(String fname, String lname, String email, String password, String mobile, String address, String nIC,
			String role) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
		this.NIC = nIC;
		this.role = role;
	}

	public User(int id, String fname, String lname, String email, String password, String mobile, String address,
			String join_date, String nIC, String role) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
		this.join_date = join_date;
		this.NIC = nIC;
		this.role = role;
	}
	
	
	public User(int id, String fname, String lname, String email, String mobile, String address, String nIC) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		NIC = nIC;
	}
	
	
	//setters and getters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	
	
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	
	
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

	
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

	public String getJoin_date() {
		return join_date;
	}

	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}

	
	
	public String getNIC() {
		return NIC;
	}
	
	
	public void setNIC(String nIC) {
		NIC = nIC;
	}

	
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
