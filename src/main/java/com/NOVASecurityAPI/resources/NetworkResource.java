package com.NOVASecurityAPI.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.NOVASecurityAPI.impl.*;
import com.NOVASecurityAPI.models.*;
import com.NOVASecurityAPI.services.*;


@Path("network")
public class NetworkResource {

  @Context
  private ServletConfig servletConfig;

  @Context
  private ServletContext servletContext;

  @Context
  private HttpServletRequest servletRequest;

  @Context
  private HttpServletResponse servletResponse;

  @Context
  private UriInfo uriInfo;

  private NetworkService delegate;

  public NetworkResource() {
    this.delegate = new NetworkImplementation();
  }

  /**
   * The `/network` endpoint returns a network report with statis...
   *
   */
  @GET
  @Path("/")
                        
  @Produces("application/json")
  public Response NetworkActivityReport() {

    return delegate.NetworkActivityReport();
  }
}    