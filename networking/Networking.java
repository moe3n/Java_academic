/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author User
 */
public class Networking {
static networkutil nc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      
        ServerSocket s=null;
        Socket s1=null;
        s=new ServerSocket(6000);
        System.out.println("Sever waiting for connection");
        s1=s.accept();//wait for a connection
        nc=new networkutil(s1);
        Object o=null;
        o=nc.read();
        System.out.println(o);
        nc.closeConnection();
        
        // TODO code application logic here
    }
    
}
