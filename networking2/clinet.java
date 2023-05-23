/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class clinet {
    static networkutil nc;
    
    public static void main(String[] args) throws UnknownHostException{
        
        nc=new networkutil("192.168.137.1",6100);
        product p=new product(22,"Toy");
        nc.write((Object)p);
        }
        // TODO code application logic here
    
    
}
