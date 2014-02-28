/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym.inheretance;

/**
 *
 * @author student
 */
public class Employee {
    
    private String empID;
    private String name;
    private String job; 


public String getEmpID()
{
 return empID;
}
public String getName()
{
 return name;
}
public String getJob()
{
 return job;
}

public void setEmpID(String id)
{
  empID= id;
}

public void setName(String ename)
{
  name= ename;
}
public void setJob(String ejob)
{
  job = ejob;
}
}