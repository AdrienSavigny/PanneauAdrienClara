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

    private final Bandeau monBandeau = new Bandeau();
    
    String message;
    public Rainbow(){
        this.message=message;
    }
    
    public void PlayOn(Bandeau b, int delay){
                monBandeau.setMessage("On va changer de couleur");
		monBandeau.sleep(delay);
		monBandeau.setBackground(Color.WHITE);
		monBandeau.sleep(delay);
		monBandeau.setForeground(Color.YELLOW);
		monBandeau.sleep(delay);
		monBandeau.setBackground(Color.BLUE);
                monBandeau.sleep(delay);
                monBandeau.setBackground(Color.GREEN);
                monBandeau.sleep(delay);
                monBandeau.setBackground(Color.RED);
                monBandeau.sleep(delay);
		monBandeau.setBackground(Color.ORANGE);
    }
            
    
}
