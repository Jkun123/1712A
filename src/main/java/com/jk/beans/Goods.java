package com.jk.beans;

public class Goods {

	private Integer gid;
	private String gname;
	private String datea;
	private Integer tid;
	private Double price;
	private String status;
	private String tname;

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goods(Integer gid, String gname, String datea, Integer tid, Double price, String status, String tname) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.datea = datea;
		this.tid = tid;
		this.price = price;
		this.status = status;
		this.tname = tname;
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getDatea() {
		return datea;
	}

	public void setDatea(String datea) {
		this.datea = datea;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", datea=" + datea + ", tid=" + tid + ", price=" + price
				+ ", status=" + status + ", tname=" + tname + "]";
	}

}
