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
public class Rainbow extends Effet {

    public int delay;
    
    
    public Rainbow(String message, int delay){
        super(message);
        this.delay=delay;
    }
    
//Permet de changer la couleur du fond "background" du message 
    @Override
    public void playOn(Bandeau b) {
		b.sleep(delay);
		b.setBackground(Color.WHITE);
		b.sleep(delay);
		b.setBackground(Color.YELLOW);
		b.sleep(delay);
		b.setBackground(Color.BLUE);
                b.sleep(delay);
                b.setBackground(Color.GREEN);
                b.sleep(delay);
                b.setBackground(Color.RED);
                b.sleep(delay);
                b.setBackground(Color.WHITE);
    }

            
    
}
