/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.laurakciic.zavrsnirad.utility;

/**
 *
 * @author Laura
 */
public class ZavrsniException extends Exception {
    
    private String poruka;
    
    public ZavrsniException(String poruka) {
        this.poruka=poruka;
    }

    public String getPoruka() {
        return poruka;
    }
    
    
}
