package com.meteofrance;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
@RegisterRestClient
public interface MeteoFranceService {

    @GET
    @Path("/lieu/facet/pluie/search/{location}")
    @Produces("application/json")
    String getLocationCode(@PathParam("location") String location);

    @GET
    @Path("/pluie/{code}")
    @Produces("application/json")
    String getPluie(@PathParam("code") String code);

}
