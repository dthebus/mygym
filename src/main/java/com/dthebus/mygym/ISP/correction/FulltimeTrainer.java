/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym.ISP.correction;

/**
 *
 * @author student
 */
public class FulltimeTrainer implements FullTimeEmployee {
    int salary;
    
    public int getSalary()
    {
     return salary;
    }

    public void setSalary(int money) {
    salary= money;   
    }
}
