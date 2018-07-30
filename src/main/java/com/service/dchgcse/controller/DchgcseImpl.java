package com.service.dchgcse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-07-30T01:54:00.475Z")

@RestSchema(schemaId = "dchgcse")
@RequestMapping(path = "/dchgcse", produces = MediaType.APPLICATION_JSON)
public class DchgcseImpl {

    @Autowired
    private DchgcseDelegate userDchgcseDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDchgcseDelegate.helloworld(name);
    }

}
