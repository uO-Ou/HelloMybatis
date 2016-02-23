package cn.lxl;

public class Teacher {

	/**
	 * @param args
	 */
	private String tid;
	private String tname;
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Teacher(String tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + "]";
	}
	

}
