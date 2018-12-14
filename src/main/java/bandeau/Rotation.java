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
    public String message; 

    public Rotation(String message) {
        super(message);
    }
   

    @Override
    public void playOn(Bandeau b) {
		for (int i = 0; i <= 100; i++) {
			b.setRotation(2*Math.PI*i / 100);
                        b.sleep(100);
                }
    }
}
