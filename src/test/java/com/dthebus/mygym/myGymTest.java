/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dthebus.mygym;

import com.dthebus.mygym.encapsulation.member;
import com.dthebus.mygym.inheretance.Trainer;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author 209236183
 */
public class myGymTest {
    
    public static member service;
   public static Trainer trainerA;
    
    public myGymTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void AssertEncap() {
        
        service.setName("Jack");
        Assert.assertEquals( "Jack", service.getName());
    }
    
    @Test
    public void AssertInheritance(){
        trainerA.setEmpID("1001");
        Assert.assertEquals( "1001", trainerA.getEmpID());
}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
        
        service = new member();
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}