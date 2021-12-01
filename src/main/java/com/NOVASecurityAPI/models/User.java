package com.NOVASecurityAPI.models;

public class User {
  private String createdat;
    
  private String createdby;
    
  private String id;
    
  private String name;
    
  private String updatedat;
    
  private String updatedby;
    
  public String getCreatedAt() {
        return this.createdat;
  }

  public void setCreatedAt(String createdat) {
        this.createdat = createdat;
  }

  public String getCreatedBy() {
        return this.createdby;
  }

  public void setCreatedBy(String createdby) {
        this.createdby = createdby;
  }

  public String getId() {
        return this.id;
  }

  public void setId(String id) {
        this.id = id;
  }

  public String getName() {
        return this.name;
  }

  public void setName(String name) {
        this.name = name;
  }

  public String getUpdatedAt() {
        return this.updatedat;
  }

  public void setUpdatedAt(String updatedat) {
        this.updatedat = updatedat;
  }

  public String getUpdatedBy() {
        return this.updatedby;
  }

  public void setUpdatedBy(String updatedby) {
        this.updatedby = updatedby;
  }
}
