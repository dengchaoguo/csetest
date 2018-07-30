package com.service.dchgcse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDchgcse {

        DchgcseDelegate dchgcseDelegate = new DchgcseDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = dchgcseDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}