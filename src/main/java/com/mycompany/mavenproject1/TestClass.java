/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.List;

/**
 *
 * @author HP
 */
public class TestClass {
    public static void main(String[] args) throws Exception{
    APIS api=new APIS();   
    List<TitanicPassenger> passengersList =api.getPassengersFromJsonFile();
    api.graphPassengerAges(passengersList);
    api.graphPassengerClass(passengersList);
    api.graphPassengersurvived(passengersList);
    api.graphPassengersurvivedGender(passengersList);
    }
    
}

