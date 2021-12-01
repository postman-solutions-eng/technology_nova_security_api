package com.NOVASecurityAPI.models.admin;

// This call updates an existing network user.  Request body should conta...
public class UpdateNetworkuserParams {
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