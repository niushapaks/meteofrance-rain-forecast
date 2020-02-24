package com.meteofrance;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/meteofrance")
public class MeteoFranceResource {

    @RestClient
    @Inject
    private MeteoFranceService meteoFranceService;

    @GET
    @Path("/location/{location}")
    @Produces(MediaType.TEXT_HTML)
    public String locate(@PathParam("location") String location){
        return meteoFranceService.getLocationCode(location);
    }

    @GET
    @Path("/rain/{code}")
    @Produces(MediaType.TEXT_HTML)
    public String rain(@PathParam("code") String code){
        return meteoFranceService.getPluie(code);
    }
}