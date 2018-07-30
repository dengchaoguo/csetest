package com.service.dchggit.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDchggit {

        DchggitDelegate dchggitDelegate = new DchggitDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = dchggitDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}