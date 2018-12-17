package bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {
    private final Bandeau monBandeau = new Bandeau();
    private final Scenario monScenario= new Scenario();
    
    public static void main(String[] args) {
	    new ExempleDUtilisation().exemple();
    }
    
    public void exemple() {
        

        String myMessage="Bandeau publicitaire";
        
        monBandeau.setMessage(myMessage);
        monBandeau.setBackground(Color.white);
        monBandeau.setForeground(Color.black);
           
        
        Effet rainbow=new Rainbow(myMessage, 350);
        Effet rotation=new Rotation(myMessage);
        Effet zoom=new Zoom(myMessage, 250);
        Effet clignotement=new Clignotement(myMessage, 250);
        Effet rainbowinversé = new Rainbowinversé(myMessage,300);
        
        monScenario.addEffet(rainbow, 3);
        monScenario.addEffet(rotation, 1);
        monScenario.addEffet(clignotement, 10);
        monScenario.addEffet(zoom, 1);
        monScenario.addEffet(rainbowinversé, 2);
        
        monScenario.playScenario(monBandeau);
   }
}
