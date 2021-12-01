package com.NOVASecurityAPI.services;


import javax.ws.rs.*;
import javax.ws.rs.core.*;

public interface NetworkService {
  /**
   * The `/network` endpoint returns a network report with statis...
   *
   */
  public Response NetworkActivityReport();

}    