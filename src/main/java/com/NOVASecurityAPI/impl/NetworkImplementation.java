package com.NOVASecurityAPI.impl;


import javax.ws.rs.core.Response;
import com.NOVASecurityAPI.models.*;
import com.NOVASecurityAPI.resources.NetworkResource;
import com.NOVASecurityAPI.services.NetworkService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;


public class NetworkImplementation implements NetworkService {
// Implement your logic here

                
  /**
   * The `/network` endpoint returns a network report with statis...
   *
   */
  @Override
  public Response NetworkActivityReport() {
    // Your code here


    return Response.status(200).build();                                                                 
  }        }




    