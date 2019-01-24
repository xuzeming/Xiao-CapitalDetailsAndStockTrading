package com.zl.pojo;

import java.util.Date;
/**
 * 资金账户表
 * @author Administrator
 *
 */
public class UserAccount {
    private Integer accountId;  // 资金账号ID

    private Integer userId;   // 用户ID

    private Integer accountNum;	// 资金账号

    private Integer accountBalance;  // 资金账号余额

    private Date accountOpenTime; // 开户时间

    private String transationPwd; // 交易密码

    private String capitalPwd;  // 资金密码

    private Integer orgId;   // 营业厅ID

    private Integer SH_Account_Num;  //上海证券账户

    private Integer SZ_Account_Num;  // 深圳证券账户

    private String a3;

    private String a4;

    private String a5;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Integer accountNum) {
        this.accountNum = accountNum;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Date getAccountOpenTime() {
        return accountOpenTime;
    }

    public void setAccountOpenTime(Date accountOpenTime) {
        this.accountOpenTime = accountOpenTime;
    }

    public String getTransationPwd() {
        return transationPwd;
    }

    public void setTransationPwd(String transationPwd) {
        this.transationPwd = transationPwd == null ? null : transationPwd.trim();
    }

    public String getCapitalPwd() {
        return capitalPwd;
    }

    public void setCapitalPwd(String capitalPwd) {
        this.capitalPwd = capitalPwd == null ? null : capitalPwd.trim();
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getSH_Account_Num() {
        return SH_Account_Num;
    }

    public void setSH_Account_Num(Integer SH_Account_Num) {
        this.SH_Account_Num = SH_Account_Num;
    }

    public Integer getSZ_Account_Num() {
        return SZ_Account_Num;
    }

    public void setSZ_Account_Num(Integer SZ_Account_Num) {
        this.SZ_Account_Num = SZ_Account_Num;
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