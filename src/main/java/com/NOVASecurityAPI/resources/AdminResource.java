package com.NOVASecurityAPI.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.NOVASecurityAPI.impl.*;
import com.NOVASecurityAPI.models.*;
import com.NOVASecurityAPI.services.*;

import com.NOVASecurityAPI.models.admin.*;
@Path("admin")
public class AdminResource {

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

  private AdminService delegate;

  public AdminResource() {
    this.delegate = new AdminImplementation();
  }

  /**
   * This call creates a new network user on the network.  

Requ...
   *
   * @param adminId 
   */
  @POST
  @Path("/{adminId}/user/new")            
  @Consumes("application/json")                        
  @Produces("application/json")
  public Response CreateNetworkUser(, @PathParam("adminId") String adminId
) {
    CreateNetworkUserParams params = new CreateNetworkUserParams();
    params.setAdminId(adminId);

    return delegate.CreateNetworkUser(params);
  }
  /**
   * This call fetches details about the all the network users cu...
   *
   * @param xMockResponseName 
   * @param adminId 
   */
  @GET
  @Path("/{adminId}/users")
                        
  @Produces("application/json")
  public Response GetAllNetworkUsers(
@HeaderParam("x-mock-response-name") String xMockResponseName, @PathParam("adminId") String adminId
) {
    GetAllNetworkUsersParams params = new GetAllNetworkUsersParams();
    params.setX-Mock-Response-Name(xMockResponseName);
    params.setAdminId(adminId);

    return delegate.GetAllNetworkUsers(params);
  }
  /**
   * This call fetches details about the specified network user.
...
   *
   * @param adminId 
   * @param userId 
   */
  @GET
  @Path("/{adminId}/users/{userId}")
                        
  @Produces("application/json")
  public Response GetNetworkuser(@PathParam("adminId") String adminId, @PathParam("userId") String userId
) {
    GetNetworkuserParams params = new GetNetworkuserParams();
    params.setAdminId(adminId);
    params.setUserId(userId);

    return delegate.GetNetworkuser(params);
  }

  /**
   * This call updates an existing network user.  

Request body ...
   *
   * @param adminId 
   * @param userId 
   */
  @PUT
  @Path("/{adminId}/users/{userId}")            
  @Consumes("application/json")                        
  @Produces("application/json")
  public Response UpdateNetworkuser(UpdateNetworkuserInlineReqJson updatenetworkuserinlinereqjson, @PathParam("adminId") String adminId, @PathParam("userId") String userId
) {
    UpdateNetworkuserParams params = new UpdateNetworkuserParams();
    params.setAdminId(adminId);
    params.setUserId(userId);

    return delegate.UpdateNetworkuser(params);
  }

  /**
   * This call deletes an existing network user having the specif...
   *
   * @param adminId 
   * @param userId 
   */
  @DELETE
  @Path("/{adminId}/users/{userId}")
                        
  @Produces("application/json")
  public Response DeleteANetworkUser(@PathParam("adminId") String adminId, @PathParam("userId") String userId
) {
    DeleteANetworkUserParams params = new DeleteANetworkUserParams();
    params.setAdminId(adminId);
    params.setUserId(userId);

    return delegate.DeleteANetworkUser(params);
  }
}    