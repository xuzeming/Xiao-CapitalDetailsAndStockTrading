package com.zl.pojo;

/**
 * 深圳A股用户股票持有表
 * @author Administrator
 *
 */
public class SZOwnStock {
    private Integer userOwnStockId;  // 用户股票持有ID

    private Integer userId;   // 用户ID

    private Integer stockNum;   // 股票代码

    private Integer stockShare; // 持有份额

    private Integer SzAccountNum; //上海A股股东账号

    private Integer BuyingPrice;  // 股票买入价格

    private String a2;

    private String a3;

    private String a4;

    private String a5;

    public Integer getUserOwnStockId() {
        return userOwnStockId;
    }

    public void setUserOwnStockId(Integer userOwnStockId) {
        this.userOwnStockId = userOwnStockId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public Integer getStockShare() {
        return stockShare;
    }

    public void setStockShare(Integer stockShare) {
        this.stockShare = stockShare;
    }

    public Integer getSzAccountNum() {
        return SzAccountNum;
    }

    public void setSzAccountNum(Integer SzAccountNum) {
        this.SzAccountNum = SzAccountNum;
    }

    public Integer getBuyingPrice() {
        return BuyingPrice;
    }

    public void setBuyingPrice(Integer BuyingPrice) {
        this.BuyingPrice = BuyingPrice;
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
}