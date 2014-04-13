/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym;

import com.dthebus.mygym.DIP.correction.Employee1;
import com.dthebus.mygym.DIP.violation.Trainer2;
import com.dthebus.mygym.ISP.correction.FulltimeTrainer;
import com.dthebus.mygym.ISP.violation.FulltimeTrainer1;
import com.dthebus.mygym.LSP.correction.Manager2;
import com.dthebus.mygym.LSP.violation.Manager3;
import com.dthebus.mygym.OCP.correction.GoldMember;
import com.dthebus.mygym.OCP.correction.customer;
import com.dthebus.mygym.OCP.violation.clients;
import com.dthebus.mygym.PLK.coorection.membershiptype;
import com.dthebus.mygym.PLK.violation.MembershipCost;
import com.dthebus.mygym.SRP.correction.EmpNameImpl;
import com.dthebus.mygym.SRP.voilation.NamesImpl;
import com.dthebus.mygym.encapsulation.member;
import com.dthebus.mygym.inheretance.Employee4;
import com.dthebus.mygym.inheretance.Trainer5;
import com.dthebus.mygym.polymorphism.Employee6;
import com.dthebus.mygym.polymorphism.Trainer6;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class gymTest {
    
    public gymTest() {
    }
    public static member service= new member();
    public static Employee4 trainerA = new Trainer5();
    public static Employee6 emp1= new Trainer6();
    public static Employee1 coDip= new Employee1();
    public static Trainer2 viDip= new Trainer2();
    public static FulltimeTrainer coIsp= new FulltimeTrainer();
    public static FulltimeTrainer1 viIsp= new FulltimeTrainer1();
    public static Manager2 coLsp= new Manager2();
    public static Manager3 viLsp= new Manager3();
    public static customer coOcp= new GoldMember();
    public static clients viOcp= new clients();
    public static membershiptype coPlk= new membershiptype();
    public static MembershipCost viPlk= new MembershipCost();
    public static NamesImpl viSRP= new NamesImpl();
    public static EmpNameImpl coSRP= new EmpNameImpl();
    @Test
    public void AssertcoSRP() {
        Assert.assertEquals( "john", viSRP.EmpName()); 
    }
    @Test
    public void AssertviSRP() {
        Assert.assertEquals( "cardio", viSRP.Workout()); 
    }
    @Test
    public void AssertviPlk() {
        Assert.assertEquals( "Gold", viPlk.getType()); 
    }
    @Test
    public void AssertcoPlk() {
        Assert.assertEquals( 500, coPlk.getfee()); 
    }
    @Test
    public void AssertviOcp() {
        Assert.assertEquals( 450.0, viOcp.fees()); 
    }
    @Test
    public void AssertcoOcp() {
        Assert.assertEquals( 500.0, coOcp.payment()); 
    }
    @Test
    public void AssertviLsp() {
        Assert.assertEquals( "swimming", viLsp.getDep()); 
    }
    @Test
    public void AssertcoLsp() {
        Assert.assertEquals( "running", coLsp.getDep()); 
    }
    @Test
    public void AssertviIsp() {
        Assert.assertEquals( 6500, viIsp.getPayment()); 
    }
    @Test
    public void AssertcoIsp() {
        Assert.assertEquals( 6500, coIsp.getSalary()); 
    }
    @Test
    public void AssertviDip() {
        Assert.assertEquals( "yoga", viDip.getDep()); 
    }
     @Test
    public void AssertcoDip() {
        Assert.assertEquals( "yoga", coDip.getDep()); 
    }
    @Test
    public void AssertEncap() {
        service.setName("Jack");
        Assert.assertEquals( "Jack", service.getName()); 
    }
    @Test
    public void AssertPoly() {
         Assert.assertEquals("darren", emp1.name());
    }
  
    @Test
    public void AssertInheritance(){
        Assert.assertEquals("darren", trainerA.getName());
}
    @BeforeClass
    public static void setUpClass() throws Exception {
       
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
