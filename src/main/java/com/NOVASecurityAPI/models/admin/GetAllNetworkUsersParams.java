package com.NOVASecurityAPI.models.admin;

// This call fetches details about the all the network users currently re...
public class GetAllNetworkUsersParams {
  private String x-mock-response-name;
    
  private String adminid;
    
  public String getX-Mock-Response-Name() {
            return this.x-mock-response-name;
  }

  public void setX-Mock-Response-Name(String x-mock-response-name) {
        this.x-mock-response-name = x-mock-response-name;
  }

  public String getAdminId() {
            return this.adminid;
  }

  public void setAdminId(String adminid) {
        this.adminid = adminid;
  }
}