package com.NOVASecurityAPI.models.admin;

// This call creates a new network user on the network.  Request body sho...
public class CreateNetworkUserParams {
  private String adminid;
    
  public String getAdminId() {
            return this.adminid;
  }

  public void setAdminId(String adminid) {
        this.adminid = adminid;
  }
}