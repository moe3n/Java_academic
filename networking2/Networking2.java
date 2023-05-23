/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking2;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Networking2 {

    /**
     * @param args the command line arguments
     */
    static networkutil nc;
    public static void main(String[] args)  {
    
        ServerSocket s=null;
        Socket s1=null;
        
        try{
            s=new ServerSocket(6100);
            s1=s.accept();
            nc=new networkutil(s1);
            Object o=nc.read();
            product p=(product)o;
            System.out.println(p.id);
            
            
        
    }catch(Exception e){
        System.out.println(e);
    }
        
        
        // TODO code application logic here
    }
    
}
