/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking1;

import java.net.*;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Networking1 {

    /**
     * @param args the command line arguments
     */
    static networkutil nc;
    public static void main(String[] args) throws UnknownHostException{
        InetAddress address=InetAddress.getLocalHost();
        System.out.println(address);
        ServerSocket s=null;
        Socket s1=null;
        String o1,o2;
        Scanner in=new Scanner(System.in);
        try{
            s=new ServerSocket(5000);
            s1=s.accept();
            nc=new networkutil(s1);
            while(true){
                o1=in.nextLine();
                nc.write(o1);
                Object o=nc.read();
                o2=(String)o;
                System.out.println(o2);
            }
            
        
    }catch(Exception e){
        
    }
        
        
        // TODO code application logic here
    }
    
}
