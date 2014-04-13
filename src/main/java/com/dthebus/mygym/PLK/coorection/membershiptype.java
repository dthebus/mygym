/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym.PLK.coorection;

/**
 *
 * @author darren
 */
public class membershiptype {
    MembershipCost cost = new MembershipCost();
    public int getfee()
    {
        return cost.fee();
    }
}
