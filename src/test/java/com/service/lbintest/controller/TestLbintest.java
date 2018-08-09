package com.service.lbintest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLbintest {

        LbintestDelegate lbintestDelegate = new LbintestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = lbintestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}