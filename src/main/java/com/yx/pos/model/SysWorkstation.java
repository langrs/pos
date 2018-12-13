package com.yx.pos.model;

import com.yx.pos.base.AbstractModel;

import java.util.Date;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class SysWorkstation extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String jh;
    //
    private String loginPos;
    //
    private String loginHt;
    //
    private String isBlls;
    //
    private String computer;
    //
    private String other;
    //
    private String computerMac;
    //
    private String branchNo;
    //
    private String isInit;
    //
    private Date initDate;
    //
    private String regCode;
    //
    private String isLogout;
    //
    private Date logoutDate;
    //
    private String keyNo;
    //
    private String snNo;
    //
    private String isRaid;
    //
    private String type;
    //
    private String counterNo;
///////////////////////////////////////////////////////////////
    public String getJh() {
        return this.jh;
    }

    public void setJh(String jh) {
        this.jh = jh;
    }
    public String getLoginPos() {
        return this.loginPos;
    }

    public void setLoginPos(String loginPos) {
        this.loginPos = loginPos;
    }
    public String getLoginHt() {
        return this.loginHt;
    }

    public void setLoginHt(String loginHt) {
        this.loginHt = loginHt;
    }
    public String getIsBlls() {
        return this.isBlls;
    }

    public void setIsBlls(String isBlls) {
        this.isBlls = isBlls;
    }
    public String getComputer() {
        return this.computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }
    public String getOther() {
        return this.other;
    }

    public void setOther(String other) {
        this.other = other;
    }
    public String getComputerMac() {
        return this.computerMac;
    }

    public void setComputerMac(String computerMac) {
        this.computerMac = computerMac;
    }
    public String getBranchNo() {
        return this.branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }
    public String getIsInit() {
        return this.isInit;
    }

    public void setIsInit(String isInit) {
        this.isInit = isInit;
    }
    public Date getInitDate() {
        return this.initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }
    public String getRegCode() {
        return this.regCode;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }
    public String getIsLogout() {
        return this.isLogout;
    }

    public void setIsLogout(String isLogout) {
        this.isLogout = isLogout;
    }
    public Date getLogoutDate() {
        return this.logoutDate;
    }

    public void setLogoutDate(Date logoutDate) {
        this.logoutDate = logoutDate;
    }
    public String getKeyNo() {
        return this.keyNo;
    }

    public void setKeyNo(String keyNo) {
        this.keyNo = keyNo;
    }
    public String getSnNo() {
        return this.snNo;
    }

    public void setSnNo(String snNo) {
        this.snNo = snNo;
    }
    public String getIsRaid() {
        return this.isRaid;
    }

    public void setIsRaid(String isRaid) {
        this.isRaid = isRaid;
    }
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getCounterNo() {
        return this.counterNo;
    }

    public void setCounterNo(String counterNo) {
        this.counterNo = counterNo;
    }

}