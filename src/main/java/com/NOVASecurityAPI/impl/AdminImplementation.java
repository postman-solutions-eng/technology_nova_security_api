package com.NOVASecurityAPI.impl;


import javax.ws.rs.core.Response;
import com.NOVASecurityAPI.models.*;
import com.NOVASecurityAPI.resources.AdminResource;
import com.NOVASecurityAPI.services.AdminService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

    import com.NOVASecurityAPI.models.admin.*;
public class AdminImplementation implements AdminService {
// Implement your logic here

    
  /**
   * This call creates a new network user on the network.  

Requ...
   *
   * @param adminId 
   */
  @Override
  public Response CreateNetworkUser(CreateNetworkUserParams params) {
    // Your code here


    return Response.status(200).build();                                                                 
  }            
  /**
   * This call fetches details about the all the network users cu...
   *
   * @param xMockResponseName 
   * @param adminId 
   */
  @Override
  public Response GetAllNetworkUsers(GetAllNetworkUsersParams params) {
    // Your code here


    return Response.status(200).build();                                                                 
  }            
  /**
   * This call fetches details about the specified network user.
...
   *
   * @param adminId 
   * @param userId 
   */
  @Override
  public Response GetNetworkuser(GetNetworkuserParams params) {
    // Your code here


    return Response.status(200).build();                                                                 
  }
          /**
   * This call updates an existing network user.  

Request body ...
   *
   * @param adminId 
   * @param userId 
   */
  @Override
  public Response UpdateNetworkuser(UpdateNetworkuserParams params) {
    // Your code here


    return Response.status(200).build();                                                                 
  }
          /**
   * This call deletes an existing network user having the specif...
   *
   * @param adminId 
   * @param userId 
   */
  @Override
  public Response DeleteANetworkUser(DeleteANetworkUserParams params) {
    // Your code here


    return Response.status(200).build();                                                                 
  }            }




    