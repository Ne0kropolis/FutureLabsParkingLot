package com.FutureGadgetParkingLot.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class TicketRestService {
    @GET
    @Path("/ticket")
    public Response ticket() {
        return Response.status(200).entity("hello").build();
    }
}
