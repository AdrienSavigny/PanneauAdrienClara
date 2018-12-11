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
public class Rotation extends Effet {
    
    private final Bandeau monBandeau = new Bandeau();
   
    public Rotation(){
        this.message=message;        
        
    }
    public void PlayOn(Bandeau b, int delay){
        monBandeau.setMessage("On va tourner");
		monBandeau.sleep(delay);
		monBandeau.setMessage("On tourne...");
		for (int i = 0; i <= 100; i++) {
			monBandeau.setRotation(2*Math.PI*i / 100);
			monBandeau.sleep(delay);
    }
    
}
}
