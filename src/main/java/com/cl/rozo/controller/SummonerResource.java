package com.cl.rozo.controller;

import com.cl.rozo.data.Summoner;
import com.cl.rozo.service.SummonerService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/summoners")
public class SummonerResource {

    @RestClient
    @Inject
    private SummonerService summonerService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{name}")
    public Summoner getSummoner(@PathParam("name") String name,
                                @QueryParam("api_key") String key){
        return summonerService.getSummoner(name, key);
    }
}
