/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author adrie
 */
public abstract class Effet {
    
    protected final String myMessage;
    
    
public Effet(String message){
    myMessage= message;
}


public void initial(Bandeau b){
    if(null!= myMessage){
        b.setMessage(myMessage);
    
    }
}
    
abstract public void playOn(Bandeau b);
}
