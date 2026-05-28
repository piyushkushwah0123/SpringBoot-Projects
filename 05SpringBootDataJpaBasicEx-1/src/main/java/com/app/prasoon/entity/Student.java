package com.app.prasoon.entity;

public class Student {
	
	private int eid;
	private String ecode;
	public Employee() {
		super();
	}
	public Employee(int i, String string, double d) {
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getcode() {
		return ecode;
	}
	public void setPcode(String ecode) {
		this.ecode = ecode;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ecode=" + ecode + "]";
	}

}
