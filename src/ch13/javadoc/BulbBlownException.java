/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13.javadoc;


public class BulbBlownException extends Exception{
    private static String text = "Bulb is blown! ";
    
    public BulbBlownException(int luminescence){
        super(text + "Luminescence that blew the bulb: " + luminescence);
    }
    
}
