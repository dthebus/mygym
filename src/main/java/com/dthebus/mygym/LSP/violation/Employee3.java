/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym.LSP.violation;

/**
 *
 * @author student
 */
public class Employee3 {
    private String trainingDepartment; 
    private String managerID;
    public String getDep()
    {
        return trainingDepartment;
    }
    public void setDep(String dep)
    {
        trainingDepartment = dep;
    }
    
    public String getManagerID()
    {
        return managerID;
    }
    public void serManagerID(String id)
    {
        managerID = id;
    }
}
