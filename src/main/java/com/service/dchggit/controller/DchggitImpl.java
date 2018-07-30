package com.service.dchggit.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-07-30T01:49:03.781Z")

@RestSchema(schemaId = "dchggit")
@RequestMapping(path = "/dchggit", produces = MediaType.APPLICATION_JSON)
public class DchggitImpl {

    @Autowired
    private DchggitDelegate userDchggitDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDchggitDelegate.helloworld(name);
    }

}
