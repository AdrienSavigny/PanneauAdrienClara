/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

/**
 *
 * @author bonne
 */
public class Clignotement {
    private final String myMessage;
    private final int myDelay;
    
    public Clignotement(String message, int delay) {
        myMessage=message;
        myDelay=delay;
    }
    
    public void playOn(Bandeau b){
            b.setForeground(b.getBackground());
            b.sleep(myDelay);
            b.setForeground(Color.black);
    }
}
