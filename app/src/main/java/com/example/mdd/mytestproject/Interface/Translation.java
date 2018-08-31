package com.example.mdd.mytestproject.Interface;

public class Translation {
    /**
     * adviserId : gw
     * adviserWxUrl : gw
     * brokerPassword : gw
     * brokerUrl : gw
     * brokerUserName : gw
     * msg : gw
     * state : 0
     * success : 1
     * tokenId : gw
     * userName : gw
     */

    private String adviserId;
    private String adviserWxUrl;
    private String brokerPassword;
    private String brokerUrl;
    private String brokerUserName;
    private String msg;
    private int state;
    private int success;
    private String tokenId;
    private String userName;

    public String getAdviserId() {
        return adviserId;
    }

    public void setAdviserId(String adviserId) {
        this.adviserId = adviserId;
    }

    public String getAdviserWxUrl() {
        return adviserWxUrl;
    }

    public void setAdviserWxUrl(String adviserWxUrl) {
        this.adviserWxUrl = adviserWxUrl;
    }

    public String getBrokerPassword() {
        return brokerPassword;
    }

    public void setBrokerPassword(String brokerPassword) {
        this.brokerPassword = brokerPassword;
    }

    public String getBrokerUrl() {
        return brokerUrl;
    }

    public void setBrokerUrl(String brokerUrl) {
        this.brokerUrl = brokerUrl;
    }

    public String getBrokerUserName() {
        return brokerUserName;
    }

    public void setBrokerUserName(String brokerUserName) {
        this.brokerUserName = brokerUserName;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

//    private String adviserId;
//
//    private String msg;
//
//    public String getAdviserId() {
//        return adviserId;
//    }
//
//    public String getMsg() { return  msg;}
//
//    public void setAdviserId(String adviserId) {
//        this.adviserId = adviserId;
//    }
//
//    public void setMsg(String msg) { this.msg = msg; };
//
//    @Override
//    public String toString() {
//        return "LoginOutEntity{" +
//                "date='" + adviserId + '\'' + msg +
//                '}';
//    }

}
