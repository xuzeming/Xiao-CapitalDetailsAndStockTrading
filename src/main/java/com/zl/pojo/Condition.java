package com.zl.pojo;

public class Condition {
	private Integer start;
	private Integer end;
	private Integer daima;
	private String name;
	private double Balance;
	private double Share;
	
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public double getShare() {
		return Share;
	}
	public void setShare(double share) {
		Share = share;
	}
	public Integer getDaima() {
		return daima;
	}
	public void setDaima(Integer daima) {
		this.daima = daima;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
	
}
