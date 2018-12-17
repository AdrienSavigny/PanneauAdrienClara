/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

/**
 *
 * @author adrie
 */
    
public class Rainbowinversé extends Effet {

    public int delay;
    
    
    public Rainbowinversé(String message, int delay){
        super(message);
        this.delay=delay;
    }
    
//Permet de changer la couleur du fond "background" du message 
    @Override
    public void playOn(Bandeau b) {
		b.sleep(delay);
		b.setForeground(Color.WHITE);
		b.sleep(delay);
		b.setForeground(Color.YELLOW);
		b.sleep(delay);
		b.setForeground(Color.BLUE);
                b.sleep(delay);
                b.setForeground(Color.GREEN);
                b.sleep(delay);
                b.setForeground(Color.RED);
               
    }

            
    
}
