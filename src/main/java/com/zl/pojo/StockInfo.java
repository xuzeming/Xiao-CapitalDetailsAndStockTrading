package com.zl.pojo;

/**
 * 股票信息表
 * @author Administrator
 *
 */
public class StockInfo {
    private Integer stockNum;  //股票代码

    private String stockName; // 股票名

    private Integer stockPrice;// 股票价格

    private Integer stockTop; // 最高

    private Integer stockLow; // 最低

    private Integer stockToday;   // 今开

    private Integer stockRemainder;  // 剩余

    private Integer Stock_Type_ID;   // 类型

    private String a2;

    private String a3;

    private String a4;

    private String a5;

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public Integer getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Integer stockPrice) {
        this.stockPrice = stockPrice;
    }

    public Integer getStockTop() {
        return stockTop;
    }

    public void setStockTop(Integer stockTop) {
        this.stockTop = stockTop;
    }

    public Integer getStockLow() {
        return stockLow;
    }

    public void setStockLow(Integer stockLow) {
        this.stockLow = stockLow;
    }

    public Integer getStockToday() {
        return stockToday;
    }

    public void setStockToday(Integer stockToday) {
        this.stockToday = stockToday;
    }

    public Integer getStockRemainder() {
        return stockRemainder;
    }

    public void setStockRemainder(Integer stockRemainder) {
        this.stockRemainder = stockRemainder;
    }

    public Integer getStock_Type_ID() {
        return Stock_Type_ID;
    }

    public void setStock_Type_ID(Integer Stock_Type_ID) {
        this.Stock_Type_ID = Stock_Type_ID;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2 == null ? null : a2.trim();
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3 == null ? null : a3.trim();
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4 == null ? null : a4.trim();
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5 == null ? null : a5.trim();
    }

	@Override
	public String toString() {
		return "StockInfo [stockNum=" + stockNum + ", stockName=" + stockName + ", stockPrice=" + stockPrice
				+ ", stockTop=" + stockTop + ", stockLow=" + stockLow + ", stockToday=" + stockToday
				+ ", stockRemainder=" + stockRemainder + ", Stock_Type_ID=" + Stock_Type_ID + ", a2=" + a2 + ", a3="
				+ a3 + ", a4=" + a4 + ", a5=" + a5 + "]";
	}
    
    
}