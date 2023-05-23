/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahmudmoeen
 */
public class Main {
    public static void main(String[] ags){
        try{
        Vehicle[] vehicles;
        vehicles = new Vehicle[100];
        vehicles[0]= new public_vehicle("C",1000,150.5);
        vehicles[1]=new private_vehicle("B",1500,200.0);
        vehicles[2]=new private_vehicle("A",2000,230.0);
        vehicles[3]= new public_vehicle("C",25000,155.5);

        for(int i=0;i<4;i++){
        System.out.println(vehicles[i].total_tax());
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
}
