package com.NOVASecurityAPI.models.admin;

// This call fetches details about the specified network user.The respons...
public class GetNetworkuserParams {
  private String adminid;
    
  private String userid;
    
  public String getAdminId() {
            return this.adminid;
  }

  public void setAdminId(String adminid) {
        this.adminid = adminid;
  }

  public String getUserId() {
            return this.userid;
  }

  public void setUserId(String userid) {
        this.userid = userid;
  }
}