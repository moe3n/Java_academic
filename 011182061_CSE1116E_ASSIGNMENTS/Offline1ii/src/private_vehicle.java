/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahmudmoeen
 */
public class private_vehicle extends Vehicle{
    
    //String grade;
    double fitnesstax;
    private_vehicle(){}
    private_vehicle(String grade,double roadtax,double fitnesstax){
        super();
        
        this.fitnesstax=fitnesstax;
        this.roadtax=roadtax;
        this.grade=grade;
        
    }
    @Override
    double total_tax(){
        //double t_tax;
        
        return 1.5*(fitnesstax+roadtax);
        
    }
   
    
    
}

    

