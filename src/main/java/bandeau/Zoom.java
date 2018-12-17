/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author bonne
 */
public class Zoom extends Effet {
    public String message;
    public int myDelay;
    
    public Zoom(String message, int delay) {
        super(message);
        myDelay=delay;
    }
    
    //Permet de réaliser un zoom sur le texte
    @Override
    public void playOn(Bandeau b){
        for (int i = 5; i < 60 ; i+=5) {

            b.setFont(new Font("Dialog", Font.BOLD, 5+i));
            b.sleep(myDelay);
	}
    }
}
