/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym.ISP.violation;

/**
 *
 * @author student
 */
public class FulltimeTrainer implements Employees {
    int salary;
    
    public int getPayment()
    {
     return salary;
    }

    public void setPayment(int money) {
    salary= money;   
    }
}
