package com.zl.pojo;

import java.io.Serializable;
/**
 * 用户中心表
 * @author Administrator
 *
 */
public class User_Centers implements Serializable{
	private static final long serialVersionUID = -1627090438944737668L;

	private Integer userId; // 用户ID

    private Integer userStatusId;  // 用户状态ID

    private String userLoginName; // 用户名

    private String netName;  // 网名

    private String userTel; // 用户绑定手机号

    private String userPwd; //登录账号密码

    private Integer accountNum; //资金账号

    private String capitalPwd; //资金密码

    private String a1;

    private String a2;

    private String a3;

    private String a4;

    private String a5;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserStatusId() {
        return userStatusId;
    }

    public void setUserStatusId(Integer userStatusId) {
        this.userStatusId = userStatusId;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName == null ? null : userLoginName.trim();
    }

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName == null ? null : netName.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public Integer getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Integer accountNum) {
        this.accountNum = accountNum;
    }

    public String getCapitalPwd() {
        return capitalPwd;
    }

    public void setCapitalPwd(String capitalPwd) {
        this.capitalPwd = capitalPwd == null ? null : capitalPwd.trim();
    }
}
