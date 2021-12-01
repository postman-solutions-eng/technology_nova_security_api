package com.NOVASecurityAPI.models.admin;

// This call deletes an existing network user having the specified id.  R...
public class DeleteANetworkUserParams {
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