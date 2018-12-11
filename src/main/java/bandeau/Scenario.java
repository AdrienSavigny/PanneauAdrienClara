/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;


import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author adrie
 */
public class Scenario {
    
    List<Effet> myEffets = new LinkedList<>();
    
    public void addEffet(Effet e, int r){
        for(int i=0; i<r;i++)
        myEffets.add(e);
    }
    
    public void playScenario(Bandeau b){
        for(Effet effet : myEffets){
            effet.playOn(b);
        }
    }
           
}
