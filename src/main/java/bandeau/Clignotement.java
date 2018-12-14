/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author bonne
 */
public class Clignotement extends Effet{
    public String message;
    public int myDelay;
    
    public Clignotement(String message, int delay) {
        super(message);
        myDelay=delay;
    }
    
    @Override
    public void playOn(Bandeau b){
            String myMessage=b.getMessage();
            b.setMessage("");
            b.sleep(myDelay);
            b.setMessage(myMessage);
            b.sleep(myDelay);
    }
}
