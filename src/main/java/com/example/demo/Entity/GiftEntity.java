package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gift_table")
public class GiftEntity {

	@Id
	@GeneratedValue
	private int gid;
	private String gname;
	private String gdesc;
	private int gprice;
	
		
	public GiftEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiftEntity(int gid, String gname, String gdesc, int gprice) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gdesc = gdesc;
		this.gprice = gprice;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGdesc() {
		return gdesc;
	}
	public void setGdesc(String gdesc) {
		this.gdesc = gdesc;
	}
	public int getGprice() {
		return gprice;
	}
	public void setGprice(int gprice) {
		this.gprice = gprice;
	}
	
}
