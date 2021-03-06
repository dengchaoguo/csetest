package com.service.lbintest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-08-09T06:49:31.740Z")

@RestSchema(schemaId = "lbintest")
@RequestMapping(path = "/lbin-test", produces = MediaType.APPLICATION_JSON)
public class LbintestImpl {

    @Autowired
    private LbintestDelegate userLbintestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userLbintestDelegate.helloworld(name);
    }

}
