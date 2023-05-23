/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahmudmoeen
 */
public class public_vehicle extends Vehicle{
    double fitnesstax;
    public_vehicle(String grade,double roadtax,double fitnesstax){
        this.fitnesstax=fitnesstax;
        this.grade=grade;
        this.roadtax=roadtax;
        
    }
    @Override
    double total_tax(){
        return fitnesstax+roadtax;
        
    }
    
}
