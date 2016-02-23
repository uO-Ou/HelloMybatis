package cn.lxl;

import java.util.ArrayList;

public class Classes {

	/**
	 * @param args
	 */
	private String cid;
	private String cname;
	private Teacher cteacher;
	private ArrayList<Student> cstudents;
    public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classes(String cid, String cname, Teacher cteacher,
			ArrayList<Student> cstudents) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cteacher = cteacher;
		this.cstudents = cstudents;
	}
	public ArrayList<Student> getCstudents() {
		return cstudents;
	}
	public void setCstudents(ArrayList<Student> cstudents) {
		this.cstudents = cstudents;
	}
	public Classes(String cid, String cname, Teacher cteacher) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cteacher = cteacher;
	}
	@Override
	public String toString() {
		return "Classes [cid=" + cid + ", cname=" + cname + ", cteacher="
				+ cteacher + ", cstudents=" + cstudents + "]";
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Teacher getCteacher() {
		return cteacher;
	}
	public void setCteacher(Teacher cteacher) {
		this.cteacher = cteacher;
	}
}
