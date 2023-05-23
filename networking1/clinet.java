/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking1;

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
        Scanner in=new Scanner(System.in);
        nc=new networkutil("192.168.137.1",5000);
        String s1,s2;
        while(true){
        Object o=nc.read();
        s1=(String)o;
        System.out.println(s1);
        s2=in.nextLine();
        nc.write(s2);
        }
        // TODO code application logic here
    }
    
}
