package vwg.fa.sc.facade;

import fh.vehicle.awk.scgroups.ScGroupTo;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.List;

/**
 * REST resource for SC group collections.
 * Handles operations on all SC groups belonging to a given class.
 */
@Path("/sc/v1/scgroups/{className}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ScGroupsResource {

    /**
     * Retrieves all SC groups for the given class.
     *
     * @param className the name of the class whose SC groups are to be retrieved
     * @return a collection of SC groups belonging to the specified class
     */
    @GET
    public Collection<ScGroupTo> getScGroups(@PathParam("className") String className) {
        return null; // your implementation
    }

    /**
     * Creates a new SC group under the given class.
     *
     * @param className the name of the class to which the new SC group belongs
     * @param scGroup   the SC group transfer object containing the data for the new group
     * @return the created SC group transfer object
     */
    @POST
    public ScGroupTo createScGroup(@PathParam("className") String className, ScGroupTo scGroup) {
        return null; // your implementation
    }

    /**
     * Deletes multiple SC groups (batch delete) for the given class.
     *
     * @param className the name of the class whose SC groups are to be deleted
     * @param scGroups  the list of SC group transfer objects to delete
     */
    @DELETE
    public void deleteScGroups(@PathParam("className") String className, List<ScGroupTo> scGroups) {
        // your implementation
    }
}
