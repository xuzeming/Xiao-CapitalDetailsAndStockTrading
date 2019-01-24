package com.zl.pojo;
/**
 * 股票类型表
 * @author Administrator
 *
 */
public class Stock_Type {
	private Integer Stock_Type_ID;   // 类型ID
	private String Stock_Type_Name; // 类型名
	public Integer getStock_Type_ID() {
		return Stock_Type_ID;
	}
	public void setStock_Type_ID(Integer stock_Type_ID) {
		Stock_Type_ID = stock_Type_ID;
	}
	public String getStock_Type_Name() {
		return Stock_Type_Name;
	}
	public void setStock_Type_Name(String stock_Type_Name) {
		Stock_Type_Name = stock_Type_Name;
	}
	
}
