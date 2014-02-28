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
public class PartTimeTrainer implements PartTimeEmployee {
    int pay;
    public int getWage() {
        return pay;
       }

    public void setWage(int money) {
        pay = money ;
         }

}
