/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinationapp;

/**
 *
 * @author Jordan
 */
public class Patient {
    private String sName;
    private int sAge;
    private boolean sSymptom;
    public Patient() {
        sName = new String();
        sSymptom = false;
        sAge = 0;
    }
    public void setsName(String sInName) {
        sName = sInName;
    }
    public String getsName() {
        return sName;
    }
    public int getsAge() {
        return sAge;
    }
    public void setsAge(int sAge) {
        this.sAge = sAge;
    }
    public boolean issSymptom() {
        return sSymptom;
    }
    public void setsSymptom(boolean sSymptom) {
        this.sSymptom = sSymptom;
    }    
}