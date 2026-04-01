package vwg.fa.sc.facade;

import fh.vehicle.awk.scgroups.ScGroupTo;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST resource for an individual SC group.
 * Handles operations on a single SC group identified by its class name and group name.
 */
@Path("/sc/v1/scgroups/{className}/{groupName}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ScGroupResource {

    /**
     * Retrieves a single SC group identified by class name and group name.
     *
     * @param className the name of the class the SC group belongs to
     * @param groupName the name of the SC group to retrieve
     * @return the SC group transfer object for the specified group
     */
    @GET
    public ScGroupTo getScGroup(
            @PathParam("className") String className,
            @PathParam("groupName") String groupName) {
        return null; // your implementation
    }

    /**
     * Updates the SC group identified by class name and group name.
     *
     * @param className the name of the class the SC group belongs to
     * @param groupName the name of the SC group to update
     * @param scGroup   the SC group transfer object containing the updated data
     * @return the updated SC group transfer object
     */
    @PUT
    public ScGroupTo updateScGroup(
            @PathParam("className") String className,
            @PathParam("groupName") String groupName,
            ScGroupTo scGroup) {
        return null; // your implementation
    }

    /**
     * Deletes the SC group identified by class name and group name.
     *
     * @param className the name of the class the SC group belongs to
     * @param groupName the name of the SC group to delete
     */
    @DELETE
    public void deleteScGroup(
            @PathParam("className") String className,
            @PathParam("groupName") String groupName) {
        // your implementation
    }
}
