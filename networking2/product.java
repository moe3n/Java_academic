/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking2;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class product implements Serializable{
    public int id;
    public String name;
    product(int id,String name){
        this.id=id;
        this.name=name;
    }
    
}
