package com.abc.ArogyaHospital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patients {
	@Id
	@Column
  private int pid;
	@Column
  private String pname;
	@Column
  private String city;
	@Column
  private String email;
	public String getPname() {
		return pname;
	}
	
	@Override
	public String toString() {
		return "Patients [pid=" + pid + ", pname=" + pname + ", city=" + city + ", email=" + email + "]";
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
}
