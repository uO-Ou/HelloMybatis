package cn.lxl;

public class User {
	
	private String uid;
	private String uname;
	private String utelephone;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUtelephone() {
		return utelephone;
	}
	public void setUtelephone(String utelephone) {
		this.utelephone = utelephone;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", utelephone="
				+ utelephone + "]";
	}
	public User(String uid, String uname, String utelephone) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.utelephone = utelephone;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
