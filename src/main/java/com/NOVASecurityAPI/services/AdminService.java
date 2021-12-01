package com.NOVASecurityAPI.services;

import com.NOVASecurityAPI.models.admin.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

public interface AdminService {
  /**
   * This call creates a new network user on the network.  

Requ...
   *
   * @param adminId 
   */
  public Response CreateNetworkUser(CreateNetworkUserParams params);

  /**
   * This call fetches details about the all the network users cu...
   *
   * @param xMockResponseName 
   * @param adminId 
   */
  public Response GetAllNetworkUsers(GetAllNetworkUsersParams params);

  /**
   * This call fetches details about the specified network user.
...
   *
   * @param adminId 
   * @param userId 
   */
  public Response GetNetworkuser(GetNetworkuserParams params);

  /**
   * This call updates an existing network user.  

Request body ...
   *
   * @param adminId 
   * @param userId 
   */
  public Response UpdateNetworkuser(UpdateNetworkuserParams params);

  /**
   * This call deletes an existing network user having the specif...
   *
   * @param adminId 
   * @param userId 
   */
  public Response DeleteANetworkUser(DeleteANetworkUserParams params);

}    