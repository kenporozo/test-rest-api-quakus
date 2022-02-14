package com.cl.rozo.service;

import com.cl.rozo.data.Summoner;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RegisterRestClient(configKey = "config-api-riot")
@Path("by-name")
public interface SummonerService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{name}")
    Summoner getSummoner(@PathParam("name") String name,
                         @QueryParam("api_key") String key);
}
