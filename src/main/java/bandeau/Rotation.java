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
    public String message; 
    public double angle;
    public double angleactuel;

    public Rotation(String message, Double angle) {
        super(message);
        this.angle= angle;
    }
   
    public void PlayOn(String message, Bandeau b, int delay){
        monBandeau.setMessage(message);
        angleactuel=monBandeau.getRotation();
		for (int i = 0; i <= 100; i++) {
			monBandeau.setRotation(angleactuel+angle *Math.PI*i / 1800);
                        monBandeau.sleep(100);
			monBandeau.sleep(delay);
    }
    
}

    @Override
    public void playOn(Bandeau b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
