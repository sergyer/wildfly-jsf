package resources;

import entities.User;
import facade.UserFacade;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by sergy on 15-Feb-17.
 */

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    private UserFacade facade;


    @GET
    @Path("{id}")
    public User getUser(@PathParam("id") Long id) {

        return facade.getUser(id);
    }

    @GET
    public List<User> getAllUsers() {
        return facade.findAllUsers();
    }

}
