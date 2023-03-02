package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Demo")
public class model {
	@Id
	@Column(name="stuid")
           private int stuid;
	@Column(name="stuname")
           private String stuname;
	@Column(name="deptname")
	       private String deptname;
	@Column(name="section")
    private String section;
	@Column(name="mobile")
    private long mobile;
	@Column(name="mailid")
    private String mailid;
	@Column(name="address")
    private String address;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public model(int stuid, String stuname, String deptname, String section, long mobile, String mailid,
			String address) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.deptname = deptname;
		this.section = section;
		this.mobile = mobile;
		this.mailid = mailid;
		this.address = address;
	}
	public model() {
		
	}
       
	
}




		